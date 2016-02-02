import java.util.Scanner;

public class Primalnumber {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez n");
		int n = input.nextInt();
		
		int a = 2;
		int i = 0;
		if ( n % 2 == 0) {
			System.out.println("Le nomre "+n+" est paire et n'est donc pas premier");
		}
		else {
			while ( n % a != 0 && a != 1 && i < Math.sqrt(n)) {
				a++;
				i++;
			}
			if ( n % a == 0) {
				System.out.println("Le nombre "+n+" n'est pas premier");
			}
			else {
				System.out.println("Le nombre "+n+" est premier");
			}
		}
	input.close();
	}
}