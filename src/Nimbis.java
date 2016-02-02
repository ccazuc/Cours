import java.util.Random;
import java.util.Scanner;

public class Nimbis {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Choisissez le mode de difficulté, 1 = malin et 0 = crétin.");
		int difficulty = input.nextInt();
		int billes = 10 + rand.nextInt( 100 - 10 );
		System.out.println("Il y a "+billes+" billes.");
		double order = Math.random();
		int pickj = 0;
		int picko = 0;
		
		if ( difficulty == 0 ) {
			if ( order <= 0.5 ) {
				System.out.println("Le joueur commence.");
				while ( billes > 0) {
					System.out.println("Entrez le nombre de billes que vous voulez prendre.");
					pickj = getPickJ(input, billes);
					billes-= pickj;
					System.out.println("Vous avez pris "+pickj+" et il reste "+billes+" billes.");
					if ( billes <= 0 ) {
						System.out.println("L'ordinateur a gagné");
						break;
					}
					picko = getPicko2(rand, billes);
					billes-= picko;
					System.out.println("L'ordinateur a pris "+picko+" billes et il reste "+billes+" billes.");
					if ( billes <= 0 ) {
						System.out.println("Le joueur a gagné.");
						break;
					}
					System.out.println("Il reste "+billes+" billes.");
				}
			}
				else {
					System.out.println("L'ordinateur commence.");
					while ( billes > 0 ) {
						picko = getPicko2(rand, billes);
						billes-= picko;
						System.out.println("L'ordinateur a pris "+picko+" billes et il reste "+billes+" billes.");
						if ( billes <= 0 ) {
							System.out.println("Le joueur a gagné.");
							break;
						}	
						System.out.println("Entrez le nombre de billes que vous voulez prendre.");
						pickj = getPickJ(input, billes);
						billes-= pickj;
						System.out.println("Vous avez pris "+pickj+" et il reste "+billes+" billes.");
						if ( billes <= 0 ) {
							System.out.println("L'ordinateur a gagné.");
							break;
						}
						System.out.println("Il reste "+billes+" billes.");
					}
				}
		}		
		else { 
			if ( order <= 0.5 ) {
				System.out.println("Le joueur commence.");
				while ( billes > 0) {
					System.out.println("Entrez le nombre de billes que vous voulez prendre.");
					pickj = getPickJ(input, billes);
					billes-= pickj;
					System.out.println("Vous avez pris "+pickj+" et il reste "+billes+" billes.");
					if ( billes <= 0 ) {
						System.out.println("L'ordinateur a gagné.");
						break;
					}
					picko = getPicko3(rand, billes);
					picko = getPickO(billes);
					billes-= picko;
					System.out.println("L'ordinateur a pris "+picko+" billes et il reste "+billes+" billes.");
					if ( billes <= 0 ) {
						System.out.println("Le joueur a gagné.");
						break;
					}
				}
			}
			else {
				System.out.println("L'ordinateur commence.");
				while ( billes > 0 ) {
					picko = getPicko3(rand, billes);
					picko = getPickO(billes);
					billes-= picko;
					System.out.println("L'ordinateur a pris "+picko+" billes et il reste "+billes+" billes.");
					if ( billes <= 0 ) {
						System.out.println("Le joueur a gagné.");
						break;
					}
					System.out.println("Entrez le nombre de billes que vous voulez prendre.");
					pickj = getPickJ(input, billes);
					billes-= pickj;
					System.out.println("Vous avez pris "+pickj+" billes  et il reste "+billes+" billes.");
					if ( billes <= 0 ) {
						System.out.println("L'ordinateur a gagné.");
						break;
					}
				}
			}
		}
		input.close();
	}	
	
	private static int getPickO(int billes) {
		int picko = 0;
		if ( billes > 63 ) {
			picko = billes - 63;
		}
		else if ( billes > 31 ) {
			picko = billes - 31;
		}
		else if ( billes > 15 ) {
			picko = billes - 15;
		}
		else if ( billes > 7 ) {
			picko = billes - 7;
		}
		else if ( billes > 3 ) {
			picko = billes - 3;
		}
		else if ( billes > 1 ) {
			picko = billes - 1;
		}
		return picko;
	}
	private static int getPicko3(Random rand, int billes) {
		int picko = 0;
		if ( billes == 63 || billes == 31 || billes == 15 || billes == 7 || billes == 3 || billes == 1 ) {
			if( billes == 1 ) {
				picko = 1;
			}
			else {
				picko = 1 + rand.nextInt( ( billes / 2 ) - 1 );
			}
		}
		return picko;
	}
	private static int getPicko2(Random rand, int billes) {
		int picko = 0;
		if( billes == 1 || billes == 2 ) {
			picko = (int)(Math.random()*2)+1;
		}
		else {
			picko = 1 + rand.nextInt( ( billes / 2 ) - 1 );
		}
		return picko;
	}
	
	private static int getPickJ(Scanner input, int billes) {
		int pickj = 0;
		boolean incorrectValue = false;
		do {
			pickj = input.nextInt();
			incorrectValue = pickj <= 0 || (billes > 1 && pickj > billes/2) || (billes == 1 && pickj > 1);
			if (incorrectValue) {
				System.out.println("Invalid");
			}
		} while (incorrectValue);
		return pickj;
	}
}	
