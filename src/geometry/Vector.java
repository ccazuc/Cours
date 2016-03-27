package geometry;

/**
 * @author cc140988
 */
public class Vector {

	private double x;
	private double y;
	
	/**
	 * Create a new <code>Vector</code> with (<code>double</code> x, <code>double</code> y) coordonates
	 * @param x
	 * @param y
	 */
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Create a new null <code>Vector</code>
	 */
	public Vector() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Create a new <code>Vector</code> between two <code>Point</code>
	 * @param beginning
	 * @param end
	 */
	public Vector(Point beginning, Point end) {
		x = end.getX()-beginning.getX();
		y = end.getY()-beginning.getY();
	}
	
	/**
	 * Return a new <code>Vector</code> with the same direction and a norm equals to 1
	 * @return Vector
	 */
	public Vector normalize() {
		return new Vector(x/norm(), y/norm());
	}
	
	/**
	 * Create a new <code>Vector</code> by multiplying the <code>Vector</code> by a scalar 
	 * @param scalar
	 * @return Vector
	 */
	public Vector mult(double scalar) {
		return new Vector(x*scalar, y*scalar);
	}
	
	/**
	 * Add a <code>Vector</code> to the <code>Vector</code>
	 * @param vector
	 * @return Vector
	 */
	public Vector add(Vector vector) {
		return new Vector(x+vector.getX(), y+vector.getY());
	}
	
	/**
	 * Return the norm of the <code>Vector</code>
	 * @return double
	 */
	public double norm() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	/**
	 * Convert an existing <code>Vector</code> to a (<code>double</code> x, <code>double</code> y) format
	 */
	public String toString() {
		return "("+Double.toString(x)+","+Double.toString(y)+")";
	}
	
	/**
	 * Display an existing <code>Vector</code> in (<code>double</code> x, <code>double</code> y) format
	 */
	public void display() {
		System.out.println(toString());
	}
	
	/**
	 * return <code>Vector</code>'x coordonate
	 * @return double
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * set <code>Vector</code>'s x coordonate
	 * @param x
	 */
	public void setX(double x) {
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
	public void setY(double y) {
		this.y = y;
	}
}
