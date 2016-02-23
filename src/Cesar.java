import java.util.Scanner;

public class Cesar {
	
	private static String decrypt;
	private static int shift;
	private static String result;
	private static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1 si vous voulez crypter un message, 2 si vous voulez en décrypter un");
		int choice = input.nextInt();
		System.out.println("Entrez la valeur de décalage du chiffrement");
		shift = input.nextInt();
		if(choice == 1) {
			System.out.println("Entrez le message à crypter");
		}
		else {
			shift = -shift;
			System.out.println("Entrez le message à décrypter");
		}
		input.nextLine();
		decrypt = input.nextLine();
		
		cesarCrypt(decrypt, shift);
		input.close();
	}

	public static void cesarCrypt (String msg, int shift) {
		int i = 0;
		while(i < msg.length()) {
			builder.append((char)(msg.substring(i).charAt(0)+shift));
			result = builder.toString();
			i++;
		}
		System.out.println(result);
	}
}
