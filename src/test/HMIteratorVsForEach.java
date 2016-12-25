package test;

import java.util.HashMap;
import java.util.Iterator;

public class HMIteratorVsForEach {

	private static HashMap<Double, Integer> map = new HashMap<Double, Integer>();
	
	public static void main(String[] args) {
		int i = 0;
		while(i < 1000000) {
			map.put(Math.random(), i);
			i++;
		}
		long time = System.nanoTime();
		for(Integer integer : map.values()) {
			if(integer == 850512) {
				System.out.println("lol.");
			}
		}
		System.out.println("For each took "+(System.nanoTime()-time)+" to execute");
		time = System.nanoTime();
		Iterator<HashMap.Entry<Double, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
		    HashMap.Entry<Double, Integer> entry = entries.next();
		    if(entry.getValue() == 850512) {
		    	System.out.println("lol.");
		    }
		}
		System.out.println("Iterator using generics took "+(System.nanoTime()-time)+" to execute");
	}
}
