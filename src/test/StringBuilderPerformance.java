package test;

public class StringBuilderPerformance {

	public static void main(String[] args) {
		String a = "iajdiqjd";
		String b = "dji<<w";
		String c = "okfokosf";
		int i = 0;
		while(i < 100000) {
			System.out.print(i);
			i++;
		}
		i = 0;
		long timer;
		long delta;
		long selfMadeTimer = 0;
		long selfMadeTimerConcat = 0;
		long javaTimer = 0;
		String tmp = null;
		while(i < 100000) {
			tmp = null;
			timer = System.nanoTime();
			tmp = a+b+c;
			delta = System.nanoTime()-timer;
			System.out.println(tmp);
			javaTimer+= delta;
			
			tmp = null;
			timer = System.nanoTime();
			tmp = new StringBuilder().append(a).append(b).append(c).toString();
			delta = System.nanoTime()-timer;
			System.out.println(tmp);
			selfMadeTimer+= delta;

			tmp = null;
			timer = System.nanoTime();
			tmp = a.concat(b).concat(c);
			delta = System.nanoTime()-timer;
			System.out.println(tmp);
			selfMadeTimerConcat+= delta;
			i++;
		}
		System.out.println(tmp);
		System.out.println("Self made timer total time : "+selfMadeTimer+", average timer : "+(selfMadeTimer/i)); 
		System.out.println("Self made concat timer total time : "+selfMadeTimerConcat+", average timer : "+(selfMadeTimerConcat/i));
		System.out.println("Java timer total time : "+javaTimer+", average timer : "+(javaTimer/i)); 
	}
}
