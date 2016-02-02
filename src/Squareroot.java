import java.util.Scanner;

public class Squareroot {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez n");
		int n = input.nextInt();
		
		int i = 0;
		int a = 0;
		while ( Math.pow(a, 2) < n && i < n) {
			a++;
			i++;
		}
		if ( Math.pow(a, 2) == n ) {
			System.out.println("La racine carré de "+n+" est "+a);
		}
		else {
		System.out.println("La racine carrée de "+n+" n'est pas entière");
		}
		input.close();
	}
}