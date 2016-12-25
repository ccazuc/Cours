package test;

import java.util.ArrayList;

public class ClearVsRemove {

	private final static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int i = 0;
		final int SIZE = 100000;
		while(i < SIZE) {
			list.add(i);
			i++;
		}
		i = 0;
		long timer = System.nanoTime();
		while(i < list.size()) {
			list.remove(i);
			i++;
		}
		System.out.println("Remove took "+(System.nanoTime()-timer)/1000+" µs to execute ("+((System.nanoTime()-timer)/1000f)/SIZE+" µs per index)");
		i = 0;
		while(i < SIZE) {
			list.add(i);
			i++;
		}
		timer = System.nanoTime();
		list.clear();
		System.out.println("Clear took "+(System.nanoTime()-timer)/1000+" µs to execute.");
	}
}
