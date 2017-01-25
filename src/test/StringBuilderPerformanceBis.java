package test;

public class StringBuilderPerformanceBis {
	
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
		timer = System.nanoTime();
		while(++i < 1000000) {
			tmp = a+b+c;
		}
		javaTimer+= System.nanoTime()-timer;
		i = 0;
		timer = System.nanoTime();
		while(++i < 1000000) {
			tmp = new StringBuilder().append(a).append(b).append(c).toString();
		}
		selfMadeTimer+= System.nanoTime()-timer;
		System.out.println(tmp);
		System.out.println("Self made timer total time : "+selfMadeTimer+", average timer : "+(selfMadeTimer/i)); 
		//System.out.println("Self made concat timer total time : "+selfMadeTimerConcat+", average timer : "+(selfMadeTimerConcat/i));
		System.out.println("Java timer total time : "+javaTimer+", average timer : "+(javaTimer/i)); 
	}
}
