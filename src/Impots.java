import java.util.Scanner;

public class Impots {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le nombre de parts, vous y compris");
		double parts = input.nextDouble();
		System.out.println("Entrez votre revenu net imposable annuel");
		double revenu = input.nextDouble();
		
		if ( parts <= 2) {
			parts = parts / 2;
		}
		else {
			parts = parts -1;
		}
		
		double revenupp = revenu / parts;
		double taux = 0;
		double deduction = 0;
		
		if ( revenupp >= 5614 && revenupp < 11198 ) {
			taux = 0.055;
			deduction = 308.77;
		}
		
		if ( revenupp >= 11198 && revenupp < 24872 ) {
			taux = 0.14;
			deduction = 1260;
		}
	
		if ( revenupp >= 24872 && revenupp < 66680 ) {
			taux = 0.30;
			deduction = 5240.12;
		}
	
		if ( revenupp >= 66680 ) {
			taux = 0.40;
			deduction = 11908.12;
		}
	
		double i = revenu * taux - deduction * parts;
		System.out.println("Vos impôts s'élèvent à "+Math.round(i)+" €");
		input.close();
	}
}