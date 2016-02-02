import java.util.Scanner;
public class Maximum {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez x");
		int x = input.nextInt();
		System.out.println("Entrez y");
		int y = input.nextInt();
		System.out.println("Entrez z");
		int z = input.nextInt();
		
		if ( x > y && x > z) {
			System.out.println(x+" Est le plus grand nombre");
		}
	
		if ( y > x && y > z) {
			System.out.println(y+" Est le plus grand nombre");
		}
		
		if ( z > x && z > y ) {
			System.out.println(z+" Est le plus grand nombre");
		}
		
		if ( x == y && y == z ) {
			System.out.println("Les 3 nombres sont identiques");
		}
		input.close();
	}
}