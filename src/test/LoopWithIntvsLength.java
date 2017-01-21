package test;

import java.util.ArrayList;

public class LoopWithIntvsLength {

	private static ArrayList<Double> list = new ArrayList<Double>();
	
	public static void main(String[] args) {
		int i = 0;
		while(i < 10000000) {
			list.add(Math.random());
			i++;
		}
		int j = 0;
		long averageSizeTime = 0;
		long averageLengthTime = 0;
		long delta ;
		while(j < 100) {
			i = 0;
			int count = 0;
			long timer = System.nanoTime();
			while(i < list.size()) {
				if(list.get(i) <= 0.5) {
					count++;
				}
				i++;
			}
			delta = System.nanoTime()-timer;
			averageSizeTime+= delta;
			//System.out.println("size took "+delta+" ns to execute.");
			i = 0;
			count = 0;
			int length = list.size();
			timer = System.nanoTime();
			while(i < length) {
				if(list.get(i) <= 0.5) {
					count++;
				}
				i++;
			}
			delta = System.nanoTime()-timer;
			averageLengthTime+= delta;
			//System.out.println("int took "+delta+" ns to execute.");
			//System.out.println(count);
			j++;
		}
		System.out.println("Average for size : "+(averageSizeTime/j)+" ns.");
		System.out.println("Average for length : "+(averageLengthTime/j)+" ns.");
	}
}
