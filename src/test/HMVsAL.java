package test;
import java.util.ArrayList;
import java.util.HashMap;

public class HMVsAL {
	
	private int text;
	private static ArrayList<HMVsAL> arrayTest = new ArrayList<HMVsAL>();
	private static HashMap<Integer, HMVsAL>  test = new HashMap<Integer, HMVsAL>();
	
	public static void main(String args[]) {
		int i = 0;
		int SIZE = 10000000;
		while(i < SIZE) {
			HMVsAL temp = new HMVsAL(i);
			arrayTest.add(temp);
			test.put(i, temp);
			i++;
		}
		System.out.println('a');
		int searched = SIZE-1000;
		i = 0;
		long timer = System.nanoTime();
		while(i < arrayTest.size()) {
			if(arrayTest.get(i).getValue() == searched) {
				break;
			}
			i++;
		}
		long iteTime = System.nanoTime()-timer;
		System.out.println("ArrayList iterative time: "+iteTime);
		timer = System.nanoTime();
		HMVsAL tt = test.get(searched);
		System.out.println("HashMap's get time: "+(System.nanoTime()-timer));
		timer = System.nanoTime();
		for(HMVsAL a : test.values()) {
			if(a.getValue() == searched) {
				break;
			}
		}
		long forEachTime = System.nanoTime()-timer;
		System.out.println("HashMap's for each time: "+forEachTime);
		System.out.println("ForEach took "+(forEachTime*1d/iteTime)+"x more time than ite");
	}
	
	public HMVsAL(int test) {
		this.text = test;
	}
	
	public int getValue() {
		return this.text;
	}
}
