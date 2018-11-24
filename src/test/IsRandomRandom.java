package test;

import java.util.HashMap;

public class IsRandomRandom {

	public static void main(String[] args)
	{
		final HashMap<Integer, Long> map = new HashMap<Integer, Long>();
		final int TOTAL = 100000000;
		final int min = 0;
		final int max = 10;
		int i = -1;
		int value = 0;
		i = min;
		while (++i <= max)
			map.put(i, 0l);
		i = -1;
		int range = max - min;
		while (++i < TOTAL)
		{
			value = (int)(min + Math.random() * (range) + 1);
			map.put(value, map.get(value) + 1);
		}
		printResult(map, TOTAL);
	}
	
	private static void printResult(HashMap<Integer, Long> map, double total)
	{
		int i = -1;
		double sum = 0;
		while (++i < 15)
			if (map.containsKey(i))
			{
				System.out.println(i + ": " + (double)(map.get(i) / total * 100.) + "%");
				sum += (double)(map.get(i) / total * 100.);
			}
		System.out.println("Sum: " + sum + "%");
	}
}
