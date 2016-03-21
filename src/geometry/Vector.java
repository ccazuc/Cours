package geometry;

public class Vector {

	private double x;
	private double y;
	
	/**
	 * Create a new Vector with (x,y) coordonates
	 * @param x
	 * @param y
	 */
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Create a new null Vector
	 */
	public Vector() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Create a new Vector between two points
	 * @param beginning
	 * @param end
	 */
	public Vector(Point beginning, Point end) {
		this.x = end.getX()-beginning.getX();
		this.y = end.getY()-beginning.getY();
	}
	
	/**
	 * Create a new Vector by multiplying one existing Vector by a scalar 
	 * @param scalar
	 * @return Vector
	 */
	public Vector mult(double scalar) {
		return new Vector(x*scalar, y*scalar);
	}
	
	/**
	 * Add a Vector to an existing Vector
	 * @param vector
	 * @return Vector
	 */
	public Vector add(Vector vector) {
		return new Vector(x+vector.getX(), y+vector.getY());
	}
	
	/**
	 * Return the norm of an existing Vector
	 * @return double
	 */
	public double norm() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	/**
	 * Convert an existing Vector to a (x,y) format
	 */
	public String toString() {
		return "("+Double.toString(x)+","+Double.toString(y)+")";
	}
	
	/**
	 * Display an existing Vector in (x,y) format
	 */
	public void display() {
		System.out.println(toString());
	}
	
	/**
	 * return Vector'x coordonate
	 * @return double
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * set Vector's x coordonate
	 * @param x
	 */
	public void setX(double x) {
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
	public void setY(double y) {
		this.y = y;
	}
}
