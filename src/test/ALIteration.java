package test;

import java.util.ArrayList;

public class ALIteration {

	public static void main(String[] args) {
		int j = 0;
		long averageTable = 0;
		long averageAL = 0;
		while(j < 80) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int[] table = new int[10000000];
			int SIZE = 10000000;
			int i = 0;
			while(i < SIZE) {
				table[i] = i;
				list.add(i);
				i++;
			}
			long result = 0;
			long delta;
			long timer = System.nanoTime();
			i = 0;
			while(i < SIZE) {
				result+= list.get(i);
				i++;
			}
			delta = (System.nanoTime()-timer)/1000;
			averageAL+= delta;
			System.out.println("AL : "+delta+" 탎. "+result);
			i = 0;
			result = 0;
			timer = System.nanoTime();
			while(i < SIZE) {
				result+= table[i];
				i++;
			}
			delta = (System.nanoTime()-timer)/1000;
			averageTable+= delta;
			System.out.println("TB : "+delta+" 탎. "+result);
			j++;
		}
		System.out.println("Average TB : "+(averageTable/80)+" 탎.");
		System.out.println("Average AL : "+(averageAL/80)+" 탎.");
	} 
}
