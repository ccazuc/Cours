import java.util.Random;
import java.util.Scanner;

public class MysteryNumberClass {
	public static void main( String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("Entrez a tel que [a,b]");
	int a = input.nextInt();
	System.out.println("Entrez b tel que [a,b]");
	int b = input.nextInt();
	int number  = a + rand.nextInt( b - a );
	
	}

	public static int getNumber (int a, int b) {
		Random rand = new Random();
	
		int number  = a + rand.nextInt( b - a );
		System.out.println("Devinez le nombre auquel je pense ?");
		return number;
	}
}
