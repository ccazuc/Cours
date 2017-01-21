package test;

public class ToLowCase {

	public static void main(String[] args) {
		int i = 0;
		long selfMadeTimer = 0;
		long javaTimer = 0;
		long delta = 0;
		long timer;
		String value = "Qdd qidjijizj QZJDIjd iqjsidjié çàr'çqd QDI idjsqijçzeuqsd JDQSSDjç";
		String result = null;
		while(i < 100000) {
			timer = System.nanoTime();
			result = value.toLowerCase();
			delta = System.nanoTime()-timer;
			javaTimer+= delta;
			//System.out.println("Java method result : "+result);
			timer = System.nanoTime();
			result = toLowerCase(value);
			delta = System.nanoTime()-timer;
			selfMadeTimer+= delta;
			//System.out.println("Self method result : "+result);
			i++;
		}
		System.out.println(result);
		System.out.println("Self method total time : "+selfMadeTimer/1000+" µs, average time : "+(selfMadeTimer)/i+" ns.");
		System.out.println("Java method total time : "+javaTimer/1000+" µs, average time : "+(javaTimer)/i+" ns.");
	}
	
	private static String toLowerCase(String str) {
		if(str.length() == 0) {
			return "";
		}
		final char[] table = new char[str.length()];
		int i = -1;
		char c;
		while(++i < str.length()) {
			c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				table[i] = ((char)(c+32));
			}
			else {
				table[i] = c;
			}
		}
		return new String(table);
	}
}
