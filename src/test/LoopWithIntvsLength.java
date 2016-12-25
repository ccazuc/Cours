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
		i = 0;
		long timer = System.nanoTime();
		int count = 0;
		while(i < list.size()) {
			if(list.get(i) <= 0.5) {
				count++;
			}
			i++;
		}
		System.out.println(count);
		System.out.println("size took "+(System.nanoTime()-timer)+" ns to execute.");
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
		System.out.println(count);
		System.out.println("int took "+(System.nanoTime()-timer)+" ns to execute.");
	}
}
