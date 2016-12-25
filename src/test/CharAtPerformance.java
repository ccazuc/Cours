package test;

public class CharAtPerformance {

	private static String text = "";
	
	public static void main(String[] args) {
		int i = 0;
		while(i < 1000000) {
			text+= 'c';
			i++;
		}
		long timer = System.nanoTime();
		char temp = text.charAt(85450);
		System.out.println((System.nanoTime()-timer)/1000+" µs.");
		System.out.println(temp);
	}
}
