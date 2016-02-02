import java.util.Scanner;

public class Complex {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le premier complexe sous la forme a+bi");
		String first = input.nextLine();
		System.out.println("Entrez le second complexe sous la forme a+bi");
		String second = input.nextLine();
		System.out.println("Entrez la puissance demandée");
		int n = input.nextInt();
		
		String[] datas = first.split("\\+");
		int rez1 = Integer.valueOf(datas[0]);
		int imz1 = Integer.valueOf(datas[1].substring(0, datas[1].length()-1));
		datas = second.split("\\+");
		int rez2 = Integer.valueOf(datas[0]);
		int imz2 = Integer.valueOf(datas[1].substring(0, datas[1].length()-1));
		input.close();
	
		addition(rez1, rez2, imz1, imz2);
		produit(rez1, rez2, imz1, imz2);
		puissance(rez1, rez2, imz1, imz2, n, 0);
		if ( n % 2 == 0) {
		
		}
		input.close();
	}
	private static void addition(int a, int b, int c, int d) {
		int sommeRe = a + b;
		int sommeIm = c + d;
		System.out.println("La somme est égale à "+sommeRe+"+"+sommeIm+"i");
	}

	private static void produit(int a, int b, int c, int d) {
		int produitRe = a * b - c * d;
		int produitIm = a * d + c * d;
		System.out.println("Le produit est égal à "+produitRe+"+"+produitIm+"i");
		
	}
	private static void puissance ( int a, int b, int c, int d, int n, int k) {
		int i = 0;
		while ( i < k) {
			int pow1 = (int) (Factorielle.binome(n, k) * Math.pow(a, n - k) * Math.pow(b, k));
			int pow2 = (int) (Factorielle.binome(n, k) * Math.pow(c, n - k) * Math.pow(d, k));
			k++;
			System.out.println("Le premier complexe à la puissance "+n+" est égal à "+pow1+" et le second à "+pow2);
		}
	}
}