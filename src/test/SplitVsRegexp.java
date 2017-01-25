package test;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class SplitVsRegexp {

	private final static Pattern splitOnSpace = Pattern.compile(" ");
	private final static ArrayList<String> list = new ArrayList<String>();
	private final static ArrayList<String[]> copyList = new ArrayList<String[]>();
	private final static int SIZE = 100000;
	
	public static void main(String[] args) {
		int j = 0;
		long averageString = 0;
		long averageRegexp = 0;
		while(j < 10) {
			fillList();
			int i = 0;
			long delta;
			long timer = System.nanoTime();
			while(i < SIZE) {
				copyList.add(list.get(i).split(" "));
				i++;
			}
			delta = System.nanoTime()-timer;
			averageString+= delta;
			System.out.println("String.split took "+delta/1000+" 탎 / "+delta+" ns");
			copyList.clear();
			i = 0;
			timer = System.nanoTime();
			while(i < SIZE) {
				copyList.add(splitOnSpace.split(list.get(i), 0));
				i++;
			}
			delta = System.nanoTime()-timer;
			averageRegexp+= delta;
			System.out.println("Compiled regexp took "+delta/1000+" 탎");
			j++;
		}
		System.out.println("Average regexp : "+(averageRegexp/j)/1000+" 탎");
		System.out.println("Average String : "+(averageString/j)/1000+" 탎");
	}
	
	private static void fillList() {
		int i = 0;
		while(i < SIZE) {
			list.add(generateRandomString());
			i++;
		}
	}
	
	public static String generateRandomString() {
		String value = "";
		int i = 0;
		while(i < 40) {
			if(i == 3 || i == 8 || i == 25) {
				value+= ' ';
				i++;
				continue;
			}
			value+= (char)(Math.random()*70);
			i++;
		}
		return value;
	}
}
