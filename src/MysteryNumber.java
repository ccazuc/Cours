import java.util.Random;
import java.util.Scanner;

public class MysteryNumber {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Entrez a tel que [a,b]");
		int a = input.nextInt();
		System.out.println("Entrez b tel que [a,b]");
		int b = input.nextInt();
		System.out.println("Devinez le nombre auquel je pense ?");
		int player = input.nextInt();
		int number  = a + rand.nextInt( b - a );
		while ( number) != player ) {
		      sup ( input, player, number);
		      inf ( input, player, number);
		}
		input.close();
	}
	
	private static void sup ( Scanner input, int player, int number ) {
	        while ( number > player ) {
		      System.out.println("Vous êtes au dessous de la solution ");
		      System.out.println("Devinez le nombre auquel je pense ?");
		      player = input.nextInt();
		      if ( number == player ) {
			    System.out.println("Vous avez trouvé le bon nombre !");
		      }
		}
	}
	
	private static void inf ( Scanner input, int player, int number) {
	      while ( number < player ) {
		    System.out.println("Vous êtes au dessus de la solution ");
		    System.out.println("Devinez le nombre auquel je pense ?");
		    player = input.nextInt();
		    if ( number == player ) {
			  System.out.println("Vous avez trouvé le bon nombre !");
		    }
	      }
	}
	
	
}
