package test;

import java.util.ArrayList;

public class AlGet {

	private final static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int i = 0;
		while(i < 10000000) {
			list.add(2*i+1);
			i++;
		}
		long timer = System.nanoTime();
		int test = list.get((int)(Math.random()*1000000));
		System.out.println(test+" took: "+(System.nanoTime()-timer)/1000d+" µs.");
	}
}
