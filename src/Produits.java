import java.util.Scanner;
public class Produits {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le nombre de produits");
		int nombre = input.nextInt();
		
		String bestName = "0";
		double bestRatio = 0;
		double ratio = 0;
		int i = 0;
		while( i < nombre ) {
			System.out.println("Nom de produit");
			String name = input.next();
			System.out.println("Prix");
			double price = input.nextDouble();
			System.out.println("Qualité");
			double quality = input.nextDouble();
			ratio = quality / price;
			i++;
			if ( ratio  > bestRatio ) {
				bestRatio = ratio;
				bestName = name;
			}
		}
		System.out.println("Le meilleur produit est "+bestName+" avec un ratio de "+bestRatio);	
		input.close();
	}
}