
public class _14_DefiningClasses {
	public static void main(String[] args) {
		Point p1 = new Point(5, 3);
		Point p2 = new Point(-4, 8);
		Point midPoint = Point.findMidPoint(p1, p2);

		System.out.printf("p1 = (%s, %s)\n", p1.getX(), p1.getY());
		System.out.printf("p2 = (%s, %s)\n", p2.getX(), p2.getY());
		System.out.printf("Distance(p1, p2) = %s\n", p1.calcDistance(p2));
		System.out.printf("mid = (%s, %s)\n", midPoint.getX(), midPoint.getY());
	}
}

class Point {
	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double calcDistance(Point otherPoint) {
		double deltaX = this.x - otherPoint.x;
		double deltaY = this.y - otherPoint.y;
		
		return Math.sqrt(deltaX*deltaX + deltaY * deltaY);
	}

	public static Point findMidPoint(Point p1, Point p2) {
		double midX = (p1.x + p2.x) / 2;
		double midY = (p1.y + p2.y) / 2;
		return new Point(midX, midY);
	}
}
