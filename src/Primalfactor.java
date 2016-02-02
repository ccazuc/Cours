import java.util.Scanner;

public class Primalfactor {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez n");
		int n = input.nextInt();
		System.out.println("Les facteurs premiers sont :");
		int i = 0;
		int a = 2;
		while ( i < n) {
			if ( Primalumberbis.isPrime(a) == true && n % a == 0) {
				while ( n % a == 0) {
					n = n / a;
					System.out.print(a+" ");
				}
			a++;
			i++;
			}
			else {
				a++;
				i++;
			}
		}
		input.close();
	}
}