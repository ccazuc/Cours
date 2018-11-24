package test;

public class Substring {

	public static void main(String[] args)
	{
		final int nbIter = 3000;
		int i = -1;
		long timer = 0;
		long javaSubStr = 0;
		long mySubStr = 0;
		String datas = "";
		while (++i < nbIter)
			datas += generatedRandomStr(10);
		i = -1;
		String result = "";
		timer = System.nanoTime();
		double rand;
		while (++i < nbIter)
		{
			rand = Math.random();
			result += datas.substring((int)(10 * rand), (int)(nbIter * rand));
		}
		javaSubStr = System.nanoTime() - timer;
		System.out.println(result);
		i = -1;
		result = "";
		System.gc();
		timer = System.nanoTime();
		while (++i < nbIter)
		{
			rand = Math.random();
			result += substring((int)(10 * rand), (int)(nbIter * rand), datas);
		}
		mySubStr = System.nanoTime() - timer;
		System.out.println("Java substring took: " + javaSubStr / 1000 + "µs, " + javaSubStr / 1000000 + "ms to execute");
		System.out.println("Personnal substring took: " + mySubStr / 1000 + "µs, " + mySubStr / 1000000 + "ms to execute");
	}
	
	public static String substring(int start, int end, String str)
	{
		char[] result = new char[end - start];
		int i = start - 1;
		int res_i = 0;
		while (++i < end)
		{
			result[res_i] = str.charAt(i);
			++res_i;
		}
		return (new String(result));
			
	}
	
	public static String generatedRandomStr(int length)
	{
		char[] result = new char[length];
		int i = -1;
		while (++i < length)
			result[i] = (char)(33 + Math.random() * 94);
		return (new String(result));
	}
}
