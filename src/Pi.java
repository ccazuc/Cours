import java.util.Random;
import java.util.Scanner;

public class Pi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Entrez en nombre d'essais");
		int n = input.nextInt();
		int i = 0;
		double x;
		double y;
		double number;
		double circle = 0;
		double square = 0;
		
		while (i < n) {
			x = rand.nextInt(100)/100.0;
			y = rand.nextInt(100)/100.0;
			number = x*x+y*y;
			if (number <= 1) {
				circle++;
			}
			else {
				square++;
			}
			i++;
		}
		double ratio = (circle/square);
		System.out.println("Le ratio est de "+ratio+" et circle = "+circle+", square = "+square);
		input.close();
	}
}