package test;

import java.util.Collection;
import java.util.HashMap;

public class HMForEach {

	private final static HashMap<Integer, Double> map = new HashMap<Integer, Double>();
	
	public static void main(String[] args) {
		int j = 0;
		int i = 0;
		while(i < 100000) {
			map.put(i, Math.random());
			i++;
		}
		long noCollectionTimer = 0;
		long collectionTimer = 0;
		long delta;
		long timer;
		while(j < 300) {
			timer = System.nanoTime();
			for(Double doubl : map.values()) {
				if(doubl <= .5d) {
					i++;
				}
			}
			delta = System.nanoTime()-timer;
			noCollectionTimer+= delta;
			timer = System.nanoTime();
			Collection<Double> collection = map.values();
			for(Double doubl : collection) {
				if(doubl <= .5d) {
					i++;
				}
			}
			delta = System.nanoTime()-timer;
			collectionTimer+= delta;
			j++;
		}
		System.out.println("Average collection timer : "+(collectionTimer/j)+" ns.");
		System.out.println("Average non-collection timer : "+(noCollectionTimer/j)+" ns.");
		System.out.println(i);
	}
}
