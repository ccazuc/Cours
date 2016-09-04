package geometry;

/**
 * @author cc140988
 */
public class TestVectorAndPoint {
	public static void main(String[] args) {
		Point x = new Point(1, 2);
		Point y = new Point(3, 6);
		Point z = new Point(4, 2);
		Triangle triangle = new Triangle(1, 2, 3, 6, 4, 2);
		
		//System.out.println(x.middle(y));
		System.out.println(triangle.perimeter());
		System.out.println(x.distanceTo(y));
	}
}
