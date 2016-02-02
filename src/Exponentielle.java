import java.util.Scanner;

public class Exponentielle {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez la valeur de x");
		int x = input.nextInt();
		
		double b = 0;
		double a = 0;
		int n = 0;
		while (!String.valueOf(b + ( Math.pow(x, n) / Factorielle.factorielle(n))).equals("Infinity") && !String.valueOf(Factorielle.factorielle(n+1)).equals("Infinity")) {
			a = ( Math.pow(x, n) / Factorielle.factorielle(n));
			b+= a;
			n++;
		}
		double exp = Math.exp(x);
		System.out.println("La valeur trouvée par approximation est "+b+" et celle par Math.exp() est "+exp);
		input.close();
	}
}