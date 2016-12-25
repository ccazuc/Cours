package test;

import java.util.regex.Pattern;

public class MailRegexp {

	private final static String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private final static Pattern regexp = Pattern.compile(pattern);
	
	public static void main(String[] args) {
		System.out.println(regexp.matcher("qijidj@hotmail.fr").matches());
	}
}
