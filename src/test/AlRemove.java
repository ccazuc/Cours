package test;

import java.util.ArrayList;

public class AlRemove {

	private final static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int i = 0;
		while(i < 15) {
			list.add(i);
			i++;
		}
		i = 0;
		while(i < list.size()) {
			list.remove(i);
		}
		i = 0;
		while(i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
	}
} 
