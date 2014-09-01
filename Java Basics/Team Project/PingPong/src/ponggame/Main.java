package ponggame;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class Main extends JFrame {

	//Double buffering
	Image dbImage;
	Graphics dbg;
	
	//Ball objects
	static Ball b = new Ball(193, 143);

	Thread ball = new Thread(b);
	Thread p1 = new Thread(b.p1);
	Thread p2 = new Thread(b.p2);
	
	boolean gameStarted = false;
	boolean startHover;
	
	boolean hardDifficulty = false;
	boolean difficultyHover;
	
	//Menu Buttons
	Rectangle startButton = new Rectangle(150, 115, 100, 25); 
	Rectangle difficultyButton = new Rectangle(150, 160, 100, 25); 


	//Variables for screen size
	int GWIDTH = 400, GHEIGHT = 300; 
	//Dimension of GWIDTH*GHEIGHT
	Dimension screenSize = new Dimension(GWIDTH, GHEIGHT);
	private static Main m;

	//Create constructor to spawn window
	public Main(){
		this.setForeground(Color.cyan);;
		this.setTitle("Pong Game");
		this.setSize(screenSize);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.addKeyListener(new KeyHandler());
		this.addMouseListener(new MouseHandler());
		this.addMouseMotionListener(new MouseHandler());
	}

	public void startGame() {
		gameStarted = true;
		ball.start();
		p1.start();
		p2.start();
	}

	public static void main(String[] args){
		Main m = new Main();
	}

	@Override
	public void paint(Graphics g){
		try {
			 dbImage = ImageIO.read(new File("src/ponggame/img/dromund_kaas.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		dbg = dbImage.getGraphics();
		draw(dbg);
		g.drawImage(dbImage, 0, 0, this);
	}
	public void draw(Graphics g){
		//Menu
		if (!gameStarted) {
			g.setFont(new Font("Arial", Font.BOLD, 30));
			g.setColor(Color.RED);
			g.drawString("Pong Game!", 125, 75);
			// Change the color of the start button if the mouse is in it
			if (!startHover) {
				g.setColor(Color.CYAN);
			}
			else {
				g.setColor(Color.green);
			}

			g.fillRect(startButton.x, startButton.y, startButton.width, startButton.height);
			g.setFont(new Font("Arial", Font.BOLD, 12)); 
			g.setColor(Color.BLACK);
			g.drawString("Start Game", startButton.x+20, startButton.y+17);
			// Change the color of the difficulty button if the mouse is in it
			if (!difficultyHover) {
				g.setColor(Color.CYAN);
			}
			else {
				g.setColor(Color.green);
			}
			g.fillRect(difficultyButton.x, difficultyButton.y, difficultyButton.width, difficultyButton.height);
			g.setColor(Color.black);
			g.drawString("Difficulty: ", difficultyButton.x + 10, difficultyButton.y+17);
			// Change the color of the text EASY/HARD if the level was switched
			if (!hardDifficulty) {
				g.setColor(Color.BLUE);
				g.drawString("Easy", difficultyButton.x + 65, difficultyButton.y + 17);
			}
			else {
				g.setColor(Color.RED);
				g.drawString("Hard", difficultyButton.x + 65, difficultyButton.y + 17);
			}
		}
		else {
			//Game drawings
			b.draw(g);
			b.p1.draw(g);
			b.p2.draw(g);
			//Scores
			g.setColor(Color.white);
			g.setFont(new Font("Arial", Font.BOLD, 15));
			g.drawString("Me : " +b.p1Score, 15, 50);
			g.drawString("You : " +b.p2Score, 340, 50);
		}
		repaint();
	}
	
	//Event Listener Classes
	public class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e){
			b.p1.keyPressed(e);
			b.p2.keyPressed(e);
		}
		@Override
		public void keyReleased(KeyEvent e){
			b.p1.keyReleased(e);
			b.p2.keyReleased(e);
		}
	}
	public class MouseHandler extends MouseAdapter {
		@Override
		public void mouseMoved(MouseEvent e){
			int mx = e.getX();
			int my = e.getY();
			// Command the change in the color of the buttons when the mouse is in them
			if (mx > startButton.x && mx < startButton.x + startButton.width &&
					my > startButton.y && my < startButton.y + startButton.height) {
				startHover = true;
			}
			else {
				startHover = false;
			}

			if (mx > difficultyButton.x && mx < difficultyButton.x + difficultyButton.width &&
					my > difficultyButton.y && my < difficultyButton.y + difficultyButton.height) {
				difficultyHover = true;

			}
			else {
				difficultyHover = false;
			}
		}
		@Override
		public void mousePressed(MouseEvent e){
			int mx = e.getX();
			int my = e.getY();
			// Command the start of the game and choose between the two levels - easy & hard
			if (mx > startButton.x && mx < startButton.x + startButton.width &&
					my > startButton.y && my < startButton.y + startButton.height) {
				startGame();
			}
			if (mx > difficultyButton.x && mx < difficultyButton.x + difficultyButton.width &&
					my > difficultyButton.y && my < difficultyButton.y + difficultyButton.height) {
				// Control the Thread.Sleep value : 7 miliseconds(default) for Easy & 4 miliseconds for Hard
				if (!hardDifficulty) {
					b.setDifficulty(4);
					hardDifficulty =true;
				}
				else {
					hardDifficulty = false;
				}
			}

		}
	}
}