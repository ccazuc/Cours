public class Factorielle {	
	public static double factorielle(int n) {
		double produit =1;
		double facteur =1;
		while(facteur <= n) {
			produit*= facteur;
			facteur++;
		}
		return produit;
	}
	public static double binome(int a, int b) {
		double binom = (factorielle(a)) / ( factorielle(b) * factorielle(a - b));
		return binom;
	}
}