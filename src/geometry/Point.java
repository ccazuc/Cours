package geometry;

public class Point {

	private double x;
	private double y;
	
	/**
	 * Create a new points with (x,y) coordonates
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Translate a points by a given Vector
	 * @param vector
	 * @return Point
	 */
	public Point translate(Vector vector) {
		return new Point(x+vector.getX(), y+vector.getY());
	}
	
	/**
	 * Return the Point in the middle of two given Point
	 * @param point
	 * @return Point
	 */
	public Point middle(Point point) {
		Vector tempVector = new Vector(new Point(this.x, this.y), point);
		tempVector.mult(.5);
		return translate(tempVector);
	}
	
	/**
	 * Return the distance between two existing points
	 * @param point
	 * @return double
	 */
	public double distanceTo(Point point) {
		System.out.println("x : "+x+" y :  "+y+" xvect : "+point.getX()+" yvect : "+point.getY());
		System.out.println("1 : "+Math.pow(point.getX()-x, 2)+" 2 : "+Math.pow(point.getY()-y, 2));
		return Math.sqrt(Math.pow(point.getX()-x, 2)+Math.pow(point.getY()-y, 2));
	}
	
	/**
	 * Convert an existing Point to a (x,y) format
	 */
	public String toString() {
		return "("+Double.toString(x)+","+Double.toString(y)+")";
	}
	
	/**
	 * Display an existing Point in (x,y) format
	 */
	public void display() {
		System.out.println(toString());
	}
	
	/**
	 * return Vector'x coordonate
	 * @return int
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * set Vector's x coordonate
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * return Vector's y coordonate
	 * @return double
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * set Vector's y coordonate
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
}
