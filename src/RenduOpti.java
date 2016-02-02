import java.util.Scanner;

public class RenduOpti {
	
	private static Scanner input = new Scanner(System.in);	
	private static double money;
	private static double somme;
	private static double difference;
	
	public static void main(String[] args) {
		
		System.out.println("Entrez la somme à payer");
		somme = input.nextDouble();
		System.out.println("Entrez combien vous avez payé");
		money = input.nextDouble();
		difference = Math.round(100*(money-somme))/100.0;
		System.out.print("Nous avons rendu la somme de "+difference+" € en ");
		rendu(" billet(s) de 20€ ", 20);
		rendu(" billet(s) de 10€ ", 10);
		rendu(" billet(s) de 5€ ", 5);
		rendu(" pièce(s) de 2€ ", 2);
		rendu(" pièce(s) de 1€ ", 1);
		rendu(" pièce(s) de 50c ", .5);
		rendu(" pièce(s) de 10c ", .1);
		rendu(" pièce(s) de 5c ", .05);
		rendu(" pièce(s) de 2c ", .02);
		rendu(" pièce(s) de 1c ", .01);
	}
	
	private static void rendu(String a, double coins) {
		int i = 0;
		while(difference-coins >= 0) {
			difference = Math.round(100*(difference-coins))/100.0;
			i++;
		}
		if(i > 0) {
			System.out.print(i+a);
		}
	}
}