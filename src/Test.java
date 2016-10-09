import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	
	private int text;
	private static ArrayList<Test> arrayTest = new ArrayList<Test>();
	private static HashMap<Integer, Test>  test = new HashMap<Integer, Test>();
	public static void main(String args[]) {
		int i = 0;
		int SIZE = 6000000;
		while(i < SIZE) {
			i++;
		}
		i = 0;
		while(i < SIZE) {
			arrayTest.add(new Test(i));
			test.put(i, new Test(i));
			i++;
		}
		int searched = SIZE-1000;
		i = 0;
		long timer = System.nanoTime();
		while(i < arrayTest.size()) {
			if(arrayTest.get(i).getValue() == searched) {
				break;
			}
			i++;
		}
		System.out.println("ArrayList time: "+(System.nanoTime()-timer)/1000000d);
		timer = System.nanoTime();
		/*for(Test a : test.values()) {
			if(a.getValue() == searched) {
				break;
			}
		}*/
		Test tt = test.get(searched);
		System.out.println("HashMap time: "+(System.nanoTime()-timer)/1000000d);
	}
	
	public Test(int test) {
		this.text = test;
	}
	
	public int getValue() {
		return this.text;
	}
}
