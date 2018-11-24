package test;

public class ViveLesEtoiles {

	private final static int MAX = 25;
	private final static char CHAR1 = '/';
	private final static char CHAR2 = '\\';
	
	public static void main(String[] args)
	{
		int i = 0;
		while (++i < MAX)
			print(i, CHAR2 + "" + CHAR2);
		while (--i >= 1)
			print(i, String.valueOf(CHAR1));
	}
	
	private static void print(int nb, String str)
	{
		int i = -1;
		while (++i < nb)
			System.out.print(str);
		System.out.print('\n');
	}
}
