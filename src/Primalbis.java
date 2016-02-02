import java.util.Scanner;

public class Primalbis {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez n");
		int n = input.nextInt();
		
		int a = 0;
		int i = 0;
		while ( Primalumberbis.isPrime( n - a ) == false && i < Math.sqrt(n) ) {
			a++;
			i++;
			}
		System.out.println("Le nombre premier inférieur le plus proche à "+n+" est "+ (n-a));
		input.close();
	}
}