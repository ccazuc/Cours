package test;

import java.util.ArrayList;

public class AlPtrMemory {

	private final static ArrayList<Double> doubleList = new ArrayList<Double>();
	
	public static void main(String[] args) {
		long usedRAM = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("First: "+usedRAM);
		int length = 1000000;
		int i = 0;
		while(i < length) {
			doubleList.add(Math.random());
			i++;
		}
		usedRAM = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Second: "+usedRAM);
		usedRAM = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Before: "+usedRAM);
		ArrayList<Double> tempList = doubleList;
		usedRAM = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("After: "+usedRAM);
		i = 0;
		while(i < tempList.size()) {
			if(tempList.get(i) == 0.568) {
				System.out.println("SU-PER");
			}
			i++;
		}
		usedRAM = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Finally: "+usedRAM);
	}
}
