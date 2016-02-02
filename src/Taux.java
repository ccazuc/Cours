import java.util.Scanner;
public class Taux {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le taux d'échange euro / dollar");
		double taux = input.nextDouble();
		
		double euro = 0;
		double dollar = 0;
		double value;
		while (( value = input.nextDouble()) != 0 ) {
			dollar = value * taux;
			System.out.println(value+" euro vaut "+dollar+" dollar");
		}
		
		while ((value = input.nextDouble()) != 0) {
			euro = value / taux;
			System.out.println(value+" dollar vaut euro "+euro);
		}
	
	input.close();
	}
}