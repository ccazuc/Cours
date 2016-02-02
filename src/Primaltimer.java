import java.util.Scanner;

public class Primaltimer {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez a tel que [a;b]");
		int a = input.nextInt();
		System.out.println("Entrez b tel que [a;b]");
		int b = input.nextInt();
		System.out.println("Entrez le nombre d'exécution de la boucle");
		int n = input.nextInt();
		
		int k = 0;
		while ( k < n ) {
			//System.out.println("La liste des nombres premiers entre "+a+" et "+b+" est : ");
			long start = System.nanoTime();
			int i = a;
			while ( i <= b ) {
				if ( Primalumberbis.isPrime(i) == true ) {
					//System.out.println(i+" ");
					i++;
				}
				else {
					i++;
				}
			}
			long totalTime =  System.nanoTime() - start ;
			System.out.println("La boucle a mit "+totalTime+" ns à s'exécuter");
			input.close();
		k++;
		}
	}
}