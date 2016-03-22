package geometry;

public class Triangle {

	private double xFirstPoint;
	private double yFirstPoint;
	private double xSecondPoint;
	private double ySecondPoint;
	private double xThirdPoint;
	private double yThirdPoint;
	
	/**
	 * Create a new Triangle based on 3 points
	 * @param xFirstPoint
	 * @param yFirstPoint
	 * @param xSecondPoint
	 * @param ySecondPoint
	 * @param xThirdPoint
	 * @param yThirdPoint
	 */
	public Triangle(double xFirstPoint, double yFirstPoint, double xSecondPoint, double ySecondPoint, double xThirdPoint, double yThirdPoint) {
		this.xFirstPoint = xFirstPoint;
		this.yFirstPoint = yFirstPoint;
		this.xSecondPoint = xSecondPoint;
		this.ySecondPoint = ySecondPoint;
		this.xThirdPoint = xThirdPoint;
		this.yThirdPoint = yThirdPoint;
	}
	
	/**
	 * translate the triangle with a given Vector
	 * @param vector
	 * @return Triangle
	 */
	public Triangle translate(Vector vector) {
		return new Triangle(xFirstPoint+vector.getX(), yFirstPoint+vector.getY(), xSecondPoint+vector.getX(), ySecondPoint+vector.getY(), xThirdPoint+vector.getX(), yThirdPoint+vector.getY());
	}
	
	/**
	 * return the perimeter of the triangle
	 * @return double
	 */
	public double perimeter() {
		Point firstPoint = new Point(xFirstPoint, yFirstPoint);
		Point secondPoint = new Point(xSecondPoint, ySecondPoint);
		Point thirdPoint = new Point(xThirdPoint, yThirdPoint);
		return firstPoint.distanceTo(secondPoint)+secondPoint.distanceTo(thirdPoint)+thirdPoint.distanceTo(firstPoint);
	}
	
	//public double pperimeter() {
		//Vector first = new Vector()
	//}
	
	/**
	 * return triangle's first point's x coordonate
	 * @return double
	 */
	public double getXFirstPoint() {
		return xFirstPoint;
	}
	
	/**
	 * return triangle's first point's y coordonate
	 * @return double
	 */
	public double getYFirstPoint() {
		return yFirstPoint;
	}
	
	/**
	 * return triangle's second point's x coordonate
	 * @return double
	 */
	public double getXSecondPoint() {
		return xSecondPoint;
	}
	
	/**
	 * return triangle's second point's y coordonate
	 * @return double
	 */
	public double getYSecondPoint() {
		return ySecondPoint;
	}
	
	/**
	 * return triangle's third point's x coordonate
	 * @return double
	 */
	public double getXThirdPoint() {
		return xThirdPoint;
	}
	
	/**
	 * return triangle's third point's y coordonate
	 * @return double
	 */
	public double getYThirdPoint() {
		return yThirdPoint;
	}
}

