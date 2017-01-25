package test;
import java.util.ArrayList;
import java.util.HashMap;

public class ALvsHM {
	
	private int text;
	private static ArrayList<ALvsHM> arrayTest = new ArrayList<ALvsHM>();
	private static HashMap<Integer, ALvsHM>  test = new HashMap<Integer, ALvsHM>();
	public static void main(String args[]) {
		int i = 0;
		for (long a = 0; a < 10000000; ++a)
		{System.out.print("");}
		int SIZE = 100;
		while(i < SIZE) {
			i++;
		}
		i = 0;
		while(i < SIZE) {
			arrayTest.add(new ALvsHM(i));
			test.put(i, new ALvsHM(i));
			i++;
		}
		int searched = SIZE-1;
		i = 0;
		long timer = System.nanoTime();
		while(i < arrayTest.size()) {
			if(arrayTest.get(i).getValue() == searched) {
				break;
			}
			i++;
		}
		System.out.println("ArrayList time: "+(System.nanoTime()-timer)/1000);
		timer = System.nanoTime();
		for(ALvsHM a : test.values()) {
			if(a.getValue() == searched) {
				break;
			}
		}
		//ALvsHM tt = test.get(searched);
		System.out.println("HashMap time: "+(System.nanoTime()-timer)/1000);
	}
	
	public ALvsHM(int test) {
		this.text = test;
	}
	
	public int getValue() {
		return this.text;
	}
}
