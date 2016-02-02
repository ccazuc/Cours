import java.util.Scanner;

public class Deplacementsbis {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez la distance à parcourir");
		int move = input.nextInt();
		
		int x = 0;
		int y = 0;
		int i = 0;
		double rng = 0;
		while (  Math.abs( x + y) < move ) {
			rng = Math.random();
			if ( rng <= 0 && rng < 0.25) {
				x++;
			}
			else if ( rng < 0.5 ) {
				x--;
			}
			else if ( rng < 0.75) {
				y++;
			}
			else if ( rng < 1 ) {
				y--;
			}
			i++;
		}
		System.out.println("Il a fallu "+i+" pas pour parcourir "+move+" mètres");
		input.close();
	}
}