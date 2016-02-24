import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CesarKey {
	
	private static String decrypt;
	private static String key;
	private static String result;
	private static StringBuilder builder = new StringBuilder();
	private static boolean keySize;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez la clé de chiffrement : ");
		while(!keySize) {
			key = input.nextLine();
			if(key.length() >= 26) {
				keySize = true;
			}
			else {		
				System.out.println("La taille de la clé n'est pas valide.");
			}
		}
		System.out.println("Entrez le message à crypter : ");
		decrypt = input.nextLine();
		cesarCrypt(decrypt, key);
		saveKey(result, key);
		System.out.println("Saved in crypted.txt");
		input.close();
	}

	public static void cesarCrypt (String msg, String key) {
		int i = 0;
		while(i < msg.length()) {
			if(msg.substring(i).charAt(0) <= 122 && msg.substring(i).charAt(0) >= 97) {
				builder.append((char)(key.substring(msg.substring(i).charAt(0)-97).charAt(0)));
			}
			else if(msg.substring(i).charAt(0) == 32) {
				builder.append(" ");
			}
			result = builder.toString();
			i++;
		}
		System.out.println("Message : "+decrypt+", crypted message : "+result);
	}
	
	public static void saveKey(String result, String key) throws FileNotFoundException {
		BufferedReader br = null;
		try {
			String content = "";
			String sCurrentLine;
			int i = 0;
			int j = 3;
			File file = new File("crypted.txt");
				if (!file.exists()) {
					file.createNewFile();
				}
			br = new BufferedReader(new FileReader("crypted.txt"));
			while(i < j) {
				sCurrentLine = br.readLine();
				if(sCurrentLine != null) {
					content+= sCurrentLine+System.lineSeparator();
					j++;
				}
				else {
					if(i == j-2) {
						content+= "Key    : "+key+System.lineSeparator();
					}
					else if(i == j-1) {
						content+= "Result : "+result+System.lineSeparator()+System.lineSeparator();
					}
				}
				i++;
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			br.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
