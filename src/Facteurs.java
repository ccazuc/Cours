import java.util.Scanner;

public class Facteurs {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez l'entier positif");
		int entier = input.nextInt();
		
		while ( entier % 2 == 0 ) {
			entier = entier / 2;
			System.out.print("2 ");
		}
		//while ( entier % 3 == 0 ) {
		//	entier = entier / 3;
		//	System.out.print("3 ");
		//}
		while ( entier % 5 == 0 ) {
			entier = entier / 5;
			System.out.print("5 ");
		}
		while ( entier % 7 == 0 ) {
			entier = entier / 7;
			System.out.print("7 ");
		}
		while ( entier % 11 == 0 ) {
			entier = entier / 11;
			System.out.print("11 ");
		}
		while ( entier % 13 == 0 ) {
			entier = entier / 13;
			System.out.print("13 ");
		}		
	input.close();
	}
}