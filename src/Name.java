import java.util.Scanner;
public class Name {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le premier prénom");
		String a = input.nextLine();
		System.out.println("Entrez le second prénom");
		String b = input.nextLine();
		System.out.println("Entrez le troisième prénom");
		String c = input.nextLine();
	
		if ( b.compareTo(a) > 0 && c.compareTo(a) > 0) {
			if ( a.compareTo(b) > 0  ) {
				System.out.println("L'ordre est : "+a+" "+b+" "+c);
			}
			
			else {
				System.out.println("L'ordre est "+a+" "+c+" "+b);
			}
		}
		
		if ( a.compareTo(b) > 0  && c.compareTo(b) > 0)  {
			if ( c.compareTo(a) > 0 ) {
				System.out.println("L'ordre est "+b+" "+a+" "+c);
			}
			else {
				System.out.println("L'ordre est "+b+" "+c+" "+a);
			}
		}
		if ( a.compareTo(c) > 0 && b.compareTo(c) > 0) {
			if ( b.compareTo(a) > 0) {
				System.out.println("L'ordre est "+c+" "+a+" "+b);
			}
			else {
				System.out.println("L'ordre est "+c+" "+b+" "+a);
			}
		}
		input.close();
	}
}