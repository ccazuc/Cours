package test;

public class TwoExposant {

	public static int number = 10;

	public static long getSum(int n)
	{
		int i = -1;
		long result = 0;
		while (++i < n)
			result += Math.pow(number, i);
		return (++result);
	}
	
	public static void main(String[] args)
	{
		final int MAX = 50;
		int i = 0;
		while (++i < MAX)
			System.out.println("N: "+i+", Pow: "+(long)Math.pow(number, i)+", Sum: "+getSum(i));
	}
}
