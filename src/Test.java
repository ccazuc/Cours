import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	private static ArrayList<String> array = new ArrayList<String>();
	public static void main(String args[]) {
		array.add("a");
		array.add("b");
		array.add("c");
		array.remove(1);
		int i = 0;
		while(i < array.size()) {
			System.out.println(array.get(i));
			i++;
		}
		System.out.println(array.size());
		
		
	}
}
