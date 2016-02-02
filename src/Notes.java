import java.util.Scanner;
public class Notes {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre les notes ( -1 pour arrêter )");
		
		int i = 0;
		double somme = 0;
		double value;
		while((value = input.nextDouble()) > -1) {
			somme+= value;
			i++;
		}
		double moyenne = somme / i;
		System.out.println("La moyenne est de "+moyenne);	
		input.close();
	}
}