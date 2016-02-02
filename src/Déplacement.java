import java.util.Scanner;

public class Déplacement {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le nombre de pas");
		int pas = input.nextInt();
		
		int i = 0;
		int x = 0;
		int y = 0;
		double rng;
		while ( i < pas ) {
			rng = Math.random();
			if ( rng <= 0 && rng < 0.25) {
				x++;
			}
			if ( rng <= 0.25 && rng < 0.5 ) {
				x--;
			}
			if ( rng <= 0.5 && rng < 0.75) {
				y++;
			}
			if ( rng <= 0.75 && rng < 1 ) {
				y--;
			}
			i++;
		}
		int xd = Math.abs( x );
		int yd = Math.abs( y );
		System.out.println("La distance parcourue est de "+(xd+yd)+" mètres");
		input.close();
	}
}