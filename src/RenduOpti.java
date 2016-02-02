import java.util.Scanner;

public class RenduOpti {
	
	private static Scanner input = new Scanner(System.in);	
	private static double money;
	private static double somme;
	private static double difference;
	private static boolean error;
	private static boolean printed;
	private static boolean nothing;
	private static String coins = " pièces(s) de ";
	private static String billet = " billet(s) de ";
	
	public static void main(String[] args) {
		
		System.out.println("Entrez la somme à payer");
		somme = input.nextDouble();
		System.out.println("Entrez combien vous avez payé");
		money = input.nextDouble();
		difference = Math.round(100*(money-somme))/100.0;
		rendu(billet+"20€, ", 20);
		rendu(billet+"10€, ", 10);
		rendu(billet+"5€, ", 5);
		rendu(coins+"2€, ", 2);
		rendu(coins+"1€, ", 1);
		rendu(coins+"50c, ", .5);
		rendu(coins+"10c, ", .1);
		rendu(coins+"5c, ", .05);
		rendu(coins+"2c, ", .02);
		rendu(coins+"1c, ", .01);
	}
	
	private static boolean rendu(String a, double coins) {
		if(difference < 0 && !error) {
			System.out.println("Vous n'avez pas donné assez d'argent");
			error = true;
			return false;
		}
		if(difference == 0 && !nothing) {
			System.out.println("Nous n'avons rien à rendre");
			nothing = true;
		}
		if(difference > 0) {
			if(!printed) {
				System.out.print("Nous avons rendu la somme de "+difference+" € en ");
				printed = true;
			}
			nothing = true;
			int i = 0;
			while(difference-coins >= 0) {
				difference = Math.round(100*(difference-coins))/100.0;
				i++;
			}
			if(i > 0) {
				System.out.print(i+a);
			}
		}
		return true;
	}
}