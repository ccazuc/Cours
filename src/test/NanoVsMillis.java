package test;

public class NanoVsMillis {

	public static void main(String[] args) {
		int i = 0;
		while(i < 1000000) {
			i++;
		}
		long timer = System.currentTimeMillis();
		long test = System.nanoTime();
		System.out.println((System.currentTimeMillis()-timer)+"µs.");
		timer = System.currentTimeMillis();
		test = System.currentTimeMillis();
		System.out.println((System.currentTimeMillis()-timer)*1000d+"µs.");
		test++;
	}
}
