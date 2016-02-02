
public class Aurelien {
	public static void main(String[] args) {
		int i = 0;
		Aurelien lol = null;
		double last = System.currentTimeMillis();
		while(i < 1000000000) {
			lol = new Aurelien(1);
			i++;
		}
		lol.a+= 5;
		System.out.println(System.currentTimeMillis()-last);
	}
		int a = 0;
		public Aurelien(int a) {
			this.a = a;
		}
}
