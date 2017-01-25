package test;

public class StringConcatPerformance {

	public static void main(String[] args) {
		String a = "iajdiqjd";
		String b = "dji<<w";
		int i = 0;
		while(i < 100000) {
			System.out.print(i);
			i++;
		}
		i = 0;
		long timer;
		long delta;
		long selfMadeConcatTimer = 0;
		long selfMadeBuilderTimer = 0;
		long javaTimer = 0;
		String tmp = null;
		while(i < 100000) {
			tmp = null;
			timer = System.nanoTime();
			tmp = a+b;
			delta = System.nanoTime()-timer;
			System.out.println(tmp);
			javaTimer+= delta;
			
			tmp = null;
			timer = System.nanoTime();
			tmp = a.concat(b);
			delta = System.nanoTime()-timer;
			System.out.println(tmp);
			selfMadeConcatTimer+= delta;
			
			tmp = null;
			timer = System.nanoTime();
			tmp = new StringBuilder().append(a).append(b).toString();
			delta = System.nanoTime()-timer;
			System.out.println(tmp);
			selfMadeBuilderTimer+= delta;
			i++;
		}
		System.out.println(tmp);
		System.out.println("Self made concat timer total time : "+selfMadeConcatTimer+", average timer : "+(selfMadeConcatTimer/i)); 
		System.out.println("Self made builder timer total time : "+selfMadeBuilderTimer+", average timer : "+(selfMadeBuilderTimer/i));
		System.out.println("Java timer total time : "+javaTimer+", average timer : "+(javaTimer/i)); 
	}
}
