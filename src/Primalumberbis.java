import java.util.Scanner;

public class Primalumberbis {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez n");
		int n = input.nextInt();

		isPrime(n);
		input.close();

		if ( isPrime(n) == true) {
			System.out.println("Le nombre "+n+" est premier");
		}
		else {
			System.out.println("Le nombre "+n+" n'est pas premier");
		}
	}
	
	static boolean isPrime(int k) {
		int a = 2;
		int i = 0;
		if ( k == 2 || k == 3 || k == 5 || k == 7) {
			return true;
		}
		else {
			if ( k % 2 == 0 || k % 3 == 0 || k % 5 == 0 || k % 7 == 0 ) {
			return false;
			}
			else {
				while ( k % a != 0 && a != 1 && i < Math.sqrt(k)) {
					a++;
					i++;
				}
				if ( k % a == 0) {
					return false;
				}
				else {
					return true;
				}
			}
		}
	}
}