package test;

import java.util.regex.Pattern;

public class IsIntegerRegexpVsParse {

	private final static Pattern isInteger = Pattern.compile("-?[0-9]+");
	
	public static void main(String[] args) {
		String test = "151qdqd551qd51q5d1qdsqs";
		long averageRegexpTimer = 0;
		long averageParseTimer = 0;
		long averageParseOptiTimer = 0;
		long delta;
		long timer;
		int j = 0;
		while(j < 100000000) {
			timer = System.nanoTime();
			isIntegerParse(test);
			delta = System.nanoTime()-timer;
			averageParseTimer+= delta;
			
			timer = System.nanoTime();
			isIntegerRegexp(test);
			delta = System.nanoTime()-timer;
			averageRegexpTimer+= delta;
			
			timer = System.nanoTime();
			isIntegerParseOpti(test);
			delta = System.nanoTime()-timer;
			averageParseOptiTimer+= delta;
			j++;
		}
		System.out.println("Average regexp time : "+(averageRegexpTimer/j)+" ns.");
		System.out.println("Average parse time : "+(averageParseTimer/j)+" ns.");
		System.out.println("Average parse opti time : "+(averageParseOptiTimer/j)+" ns.");
	}
	
	private static boolean isIntegerParse(String str) {
		int i = -1;
		while(++i < str.length()) {
			if(str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isIntegerParseOpti(String str) {
		int i = -1;
		while(++i < str.length()) {
			char c = str.charAt(i);
			if(c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isIntegerRegexp(String str) {
		return isInteger.matcher(str).matches();
	}
}
 