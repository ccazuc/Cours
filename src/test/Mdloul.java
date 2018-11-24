package test;

public class Mdloul {

	public static void main(String[] args)
	{
		String msg = "89 107 102 127 126 42 55 86 42 126 101 127 121 38 42 110 55 93 96 107 42 109 109 42 55 86 42 105 111";
		String split[] = msg.split(" ");
		int i = -1;
		int res[] = new int[split.length];
		while (++i < split.length)
			res[i] = Integer.valueOf(split[i]) - 23;
		i = -1;
		while (++i < res.length)
			System.out.print((char)res[i]);
	}
}