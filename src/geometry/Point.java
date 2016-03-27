package geometry;

/**
 * 
 * @author cc140988
 *
 */
public class Point {

	private double x;
	private double y;
	
	/**
	 * Create a new points with (<code>double</code> x, <code>double</code> y) coordonates
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Translate a <code>Point</code> by a given <code>Vector</code>
	 * @param vector
	 * @return Point
	 */
	public Point translate(Vector vector) {
		return new Point(x+vector.getX(), y+vector.getY());
	}
	
	/**
	 * Return the <code>Point</code> in the middle of two given <code>Point</code>
	 * @param point
	 * @return Point
	 */
	public Point middle(Point point) {
		Vector tempVector = new Vector(new Point(this.x, this.y), point);
		return translate(tempVector.mult(.5));
	}
	
	/**
	 * Return the distance between two existing <code>Point</code>
	 * @param point
	 * @return double
	 */
	public double distanceTo(Point point) {
		return Math.sqrt(Math.pow(point.getX()-x, 2)+Math.pow(point.getY()-y, 2));
	}
	
	/**
	 * Convert an existing <code>Point</code> to a (<code>double</code> x, <code>double</code> y) format
	 */
	public String toString() {
		return "("+Double.toString(x)+","+Double.toString(y)+")";
	}
	
	/**
	 * Display an existing <code>Point</code> in (<code>double</code> x, <code>double</code> y) format
	 */
	public void display() {
		System.out.println(toString());
	}
	
	/**
	 * return <code>Vector</code>'x coordonate
	 * @return int
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * set <code>Vector</code>'s x coordonate
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * return <code>Vector</code>'s y coordonate
	 * @return double
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * set <code>Vector</code>'s y coordonate
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
}
