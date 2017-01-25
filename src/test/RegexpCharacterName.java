package test;

import java.util.regex.Pattern;

public class RegexpCharacterName {

	private final static Pattern checkName = Pattern.compile("[a-zA-Z]{3,10}");
	
	public static void main(String[] args) {
		int i = 0;
		while(i < 500000) {
			System.out.print(i);
			i++;
		}
		int j = 0;
		while(j < 20) {
			String name = "Cesdqqdsqddd";
			long timer = System.nanoTime();
			boolean result = checkName.matcher(name).matches();
			System.out.println("Regexp took : "+(System.nanoTime()-timer)/1000+" µs. "+result);
			timer = System.nanoTime();
			result = checkCharacterName(name);
			System.out.println("parse took : "+(System.nanoTime()-timer)/1000+" µs. "+result);
			j++;
		}
	}
	
	private static boolean checkCharacterName(String name) {
		int i = 0;
		if(name.length() >= 2 && name.length() <= 10) {
			while(i < name.length()) {
				char temp = name.charAt(i);
				if(((temp < 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z')) && temp != 'é' && temp != 'è' && temp != 'ç' && temp != 'à' && temp != 'ê' && temp != 'â' && temp != 'û' && temp != 'ë' && temp != 'ä' && temp != 'ü') {
					return false;
				}
				if(i < name.length()-3) {
					if(name.charAt(i) == name.charAt(i+1) && name.charAt(i+1) == name.charAt(i+2)) {
						return false;
					}
				}
				i++;
			}
		}
		else {
			return false;
		}
		return true;
	}
}
