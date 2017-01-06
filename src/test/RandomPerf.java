package test;

public class RandomPerf {

	public static void main(String[] args) {
		int i = 0;
		while(i < 1000000) {
			i++;
		}
		i = 0;
		long timer;
		long delta;
		double random;
		long average = 0;
		long time = System.nanoTime();
		while(i < 100) {
			//timer = System.nanoTime();
			random = Math.random();
			//delta = System.nanoTime()-timer;
			//average+= delta;
			i++;
		}
		System.out.println("Loop took "+(System.nanoTime()-time)/1000+" µs to execute.");
		System.out.println("Average : "+((average)/i)+" ns.");
	}
}
