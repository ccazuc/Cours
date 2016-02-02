import java.util.Scanner;

public class Rendu1 {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez la somme à payer");
		double somme = input.nextDouble();
		System.out.println("Entrez combien vous avez payé");
		double money = input.nextDouble();
		int i = 0; //10€
		int j = 0; //5€
		int k = 0; //2€
		int a = 0; //1€
		int b = 0; //50c
		int c = 0; //20c
		int x = 0; //10c
		int y = 0; //5c
		int z = 0; //1c
	
		if ( money > somme ) {
			money -= somme;
			while ( money % 10 == 0 ) {
				money = money / 10;
				i++;
			}
			if ( i != 0 ) {
				System.out.print("Nous avons rendu "+i+" billet(s) de 10€, ");
			}
			while ( money % 5 == 0 && money != 0 ) {
				money = money / 5;
				j++;
			}
			if ( j != 0 ) {
				System.out.print(j+"billet(s) de 5€, ");
			}
			while ( money % 2 == 0 && money != 0 ) {
				money = money / 2;
				k++;
			}
			if ( k != 0 ) {
				System.out.print(k+"pièce(s) de 2€, ");
			}
			while ( money % 1 == 0 && money != 0 ) {
				money = money / 1;
				a++;
			}
			if ( a != 0 ) {
				System.out.print(a+"pièces() de 1€, ");
			}
			while ( money % 0.5 == 0 && money != 0 ) {
				money = money / 0.5;
				b++;
			}
			if ( b != 0 ) {
				System.out.print(b+"pièce(s) de 50c, ");;
			}
			while ( money % 0.2 == 0 && money != 0 ) {
				money = money / 0.2;
				c++;
			}
			if ( c != 0 ) {
				System.out.print(c+"pièce(s) de 20c, ");
			}
			while ( money % 0.1 == 0 && money != 0 ) {
				money = money / 0.1;
				x++;
			}
			if ( x != 0 ) {
				System.out.print(x+"pièce(s) de 10c, ");
			}
			while ( money % 0.05 == 0 && money != 0 ) {
				money = money / 0.05;
				y++;
			}
			if ( y != 0 ) {
				System.out.print(y+"pièce(s) de 5c, ");
			}
			while ( money % 0.01 == 0 && money != 0 ) {
				money = money / 0.01;
				z++;
			}
			if ( z != 0 ) {
				System.out.println(z+" pièce(s) de 1c.");
			}
		}
		input.close();
	}
}