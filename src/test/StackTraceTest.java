package test;

public class StackTraceTest {
	
	public static void a()
	{
		b();
	}
	
	public static void b()
	{
		c();
	}
	
	public static void c()
	{
		d();
	}
	
	public static void d()
	{
		StackTraceElement[] trace = new Throwable().getStackTrace();
		int i = -1;
		while (++i < trace.length)
			System.out.println(trace[i]);
	}
	
	public static void main(String[] args)
	{
		a();
	}
}
