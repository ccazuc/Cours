import java.util.Scanner;

public class Equation {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le type d'équation, 1er degré = 1, 2 degré = 2 , exponentielle = 3");
		int type = input.nextInt();
		
		if ( type == 1) {
			System.out.println("Entrez a");
			int a = input.nextInt();
			System.out.println("Entrez b");
			int b = input.nextInt();
			premier(a,b);
		}
		
		if ( type == 2) {
			System.out.println("Entrez a");
			int a = input.nextInt();
			System.out.println("Entrez b");
			int b = input.nextInt();
			System.out.println("Entrez c");
			int c = input.nextInt();
			second(a,b,c);
		}
		
	input.close();
	}
	
	private static void premier(int a, int b) {
		int x = - b / a;
		System.out.println("La solution est x = "+x);
	}
	
	private static void second(int a, int b, int c) {
		double d = b * b - 4 * a * c;
		
		if ( d > 0 ) { 
			double x1 = ( - b - Math.sqrt(d)) / 2 * a;
			double x2 = ( - b + Math.sqrt(d)) / 2 * a;
			System.out.println("Les solutions sont x1 = "+x1+" et x2 = "+x2);
		}
		if ( d == 0 ) {
			double x1 = ( -b ) / 2 * a;
			System.out.println("L'unique solution est : "+x1);
		}
		if ( d < 0 ) {
			System.out.println("Les complexes c'est chiant");
		}
	}
}
	
