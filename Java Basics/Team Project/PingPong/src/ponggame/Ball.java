package ponggame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Ball implements Runnable {
    
    //Global variables
    int x, y, xDirection, yDirection;
    
    int difficulty = 7; 
    
    //Score variables
    int p1Score, p2Score;
    // Paddles creation
    Paddle p1 = new Paddle(16, 122, 1);
    Paddle p2 = new Paddle(373, 122, 2);
    
    Rectangle ball;
    String sound = "src/ponggame/audio/ping pong.wav"; // ping.pong.wav
    static void music(String sound){
		try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(sound));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            
            clip.start();
        }
        
        catch(UnsupportedAudioFileException uae) {
            System.out.println(uae);
        }
        catch(IOException ioe) {
            System.out.println(ioe);
        }
        catch(LineUnavailableException lua) {
            System.out.println(lua);
        }
	}    
    // Ball constructor    
    public Ball(int x, int y){
        p1Score = p2Score = 0;
        this.x = x;
        this.y = y;
        //Set ball moving randomly
        Random r = new Random();
        int rDir = r.nextInt(1);
        if(rDir == 0)
            rDir--;
        setXDirection(rDir);
        int yrDir = r.nextInt(1);
        if(yrDir == 0)
            yrDir--;
        setYDirection(yrDir);
        
	//Create 'ball'
        ball = new Rectangle(this.x, this.y, 13, 13);
    }
    
    public void setXDirection(int xdir){
        xDirection = xdir;
    }
    public void setYDirection(int ydir){
        yDirection = ydir;
    }
    // Drawing the ball
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(ball.x, ball.y, ball.width, ball.height);
    }
    
    // Collision detection
    public void collision(){
        if(ball.intersects(p1.paddle)){
            setXDirection(+1);
            music(sound);
        }
        if(ball.intersects(p2.paddle)){
            setXDirection(-1);
            music(sound);
        }
    }
    
    public void move(){
        collision();
        ball.x += xDirection;
        ball.y += yDirection;
        //Bounce the ball when edge is detected
        if(ball.x <= 0){
            setXDirection(+1);
            // Sound can be played when one of the players score
            p2Score++;
            //music(soundBells);
        }
        if(ball.x >= 385){
            setXDirection(-1);
            p1Score++;
            //music(soundBells);
        }
        if(ball.y <= 15){
            setYDirection(+1);
           // music(sound);
        }
        if(ball.y >= 285){
            setYDirection(-1);
           // music(sound);
        }
    }
    public void setDifficulty(int diff) {
    	difficulty = diff;
	}
    
    @Override
    public void run(){
        try{
            while(true){
                move();
                Thread.sleep(difficulty);
            }
        }catch(Exception e){System.err.println(e.getMessage());}
    }
    
}