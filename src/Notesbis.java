import java.util.Scanner;
public class Notesbis {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre les notes ( -1 pour arr�ter )");
		
		int i = 0;
		double somme = 0;
		double sommesqr = 0;
		double value;
		while((value = input.nextDouble()) > -1) {
			somme+= value;
			sommesqr+= value * value;
			i++;
		}
		double ecart = Math.sqrt( (sommesqr - (( 1 / i ) * ( somme * somme))) / i  );
		double moyenne = somme / i;
		System.out.println("Somme� = "+sommesqr+", i = "+i);
		System.out.println("La moyenne est de "+moyenne+" et l'�cart type est de "+ecart);	
		input.close();
	}
}