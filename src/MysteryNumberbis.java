import java.util.Random;
import java.util.Scanner;

public class MysteryNumberbis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Si c'est le joueur qui choisit, entrez 1, sinon, entrez 0");
		int difficulty = input.nextInt();
		System.out.println("Entrez a tel que [a,b[");
		int a = input.nextInt();
		System.out.println("Entrez b tel que [a,b[");
		int b = input.nextInt();
		
		if(difficulty == 1) {
			System.out.println("Devinez le nombre auquel je pense ?");
			int player = input.nextInt();
			if(b < a) {
				System.out.print("Invalid ( b must be greater than a )");
				input.close();
				return;
			}
			int number = a+rand.nextInt(b-a);
			
			while(number != player) {
				 if(number > player) {
					 System.out.println("Vous êtes au dessous de la solution ");
					 System.out.println("Devinez le nombre auquel je pense ?");
				 }
				 else if(number < player) {
					 System.out.println("Vous êtes au dessus de la solution ");
					 System.out.println("Devinez le nombre auquel je pense ?");
				 }
			      player = input.nextInt();
			}
			System.out.println("Vous avez trouvé le bon nombre !");
		}
		else {
			System.out.println("Entrez le nombre que l'ordinateur doit trouver");
			int player = input.nextInt();
			int number = b/2;
			int number1 = (b-number)/2; 
			
			while(number != player) {
				System.out.println("Le nombre auquel l'ordinateur pense est "+number+", s'il est inférieur à votre nombre, entrez 0, sinon, entrez 1");
				int order = input.nextInt();
				if(order == 0) {
					number+= number1;
				}
				else {
					number-= number1;
				}
				number1/= 2;
			}
			System.out.println("L'ordinateur a trouvé votre nombre, c'était "+number);
		}
		input.close();
	}			
}
