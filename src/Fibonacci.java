import java.util.Scanner;
public class Fibonacci {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez n");
		int n = input.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		int i = 0;
		while(i < n) {
			c = a +b;
			a = b;
			b = c;
			i++;
			System.out.println("F("+i+") = "+a);
		}
	input.close();
	}
}