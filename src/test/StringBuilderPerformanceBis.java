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
		int j = 0;
		while(j < 15) {
			long timer;
			long delta;
			long selfMadeTimer = 0;
			long selfMadeTimerConcat = 0;
			long javaTimer = 0;
			final int ITERATION = 10000;
			String tmp = null;
			i = 0;
			timer = System.nanoTime();
			while(++i < ITERATION) {
				tmp+= new StringBuilder().append(a).append(b).append(c).toString();
			}
			selfMadeTimer+= System.nanoTime()-timer;
			i = 0;
			tmp = null;
			timer = System.nanoTime();
			while(++i < ITERATION) {
				tmp+= a+b+c;
			}
			javaTimer+= System.nanoTime()-timer;
			//System.out.println(tmp);
			System.out.println("Self made timer total time : "+selfMadeTimer+", average timer : "+(selfMadeTimer/ITERATION)); 
			//System.out.println("Self made concat timer total time : "+selfMadeTimerConcat+", average timer : "+(selfMadeTimerConcat/i));
			System.out.println("Java timer total time : "+javaTimer+", average timer : "+(javaTimer/ITERATION)); 
			
		j++;
		}
	}
}
