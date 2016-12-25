package test;

import java.util.ArrayList;
import java.util.HashMap;

public class AlPtrTest {

	private final static HashMap<Integer, ArrayList<Integer>> intList = new HashMap<Integer, ArrayList<Integer>>();
	
	public static void main(String[] args) {
		intList.put(0, new ArrayList<Integer>());
		intList.get(0).add(1);
		intList.get(0).add(2);
		intList.get(0).add(3);
		intList.get(0).add(4);
		intList.get(0).add(5);
		ArrayList<Integer> tempList = intList.get(0);
		int i = 0;
		while(i < tempList.size()) {
			if(tempList.get(i) == 3) {
				tempList.remove(i);
				break;
			}
			i++;
		}
		i = 0;
		while(i < intList.get(0).size()) {
			System.out.print(intList.get(0).get(i));
			i++;
		}
	}
}
