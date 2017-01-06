package test;

import java.util.ArrayList;

public class ALIteration {

	private final static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		final int LENGTH = 1000000;
		int inferiorSizeAverage = 0;
		int superiorZeroAverage = 0;
		long delta;
		long timer;
		int i = 0;
		int j = 0;
		final int SEARCHED = LENGTH/2;
		while(i < LENGTH) {
			list.add(i);
			i++;
		}
		while(j < 1000) {
			timer = System.nanoTime();
			i = 0;
			while(i < list.size()) {
				if(list.get(i) == SEARCHED) {
					break;
				}
				i++;
			}
			delta = (System.nanoTime()-timer)/1000;
			System.out.println("Inferior to size : "+delta+" 탎.");
			inferiorSizeAverage+= delta;
			i = list.size();
			timer = System.nanoTime();
			while(--i >= 0) {
				if(list.get(i) == SEARCHED) {
					break;
				}
			}
			delta = (System.nanoTime()-timer)/1000;
			System.out.println("Superior to zero : "+delta+" 탎.");
			superiorZeroAverage+= delta;
			j++;
		}
		System.out.println("-----------------------------------");
		System.out.println("Inferior to size average over "+j+" iterations  : "+inferiorSizeAverage/j+" 탎.");
		System.out.println("Superior to zero average over "+j+" iterations  : "+superiorZeroAverage/j+" 탎.");
	}
}
