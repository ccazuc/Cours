package test;

public class StringComparison {

	public static void main(String[] args) {
		String[] test = new String[] {"bla", "alb", "qi", "Bla", "Qcvb", "Qod", "xiw", "pqj", "Q fjq"};
		String temp = "";
		int i = 0;
		int j = 0;
		while(i < test.length) {
			j = i;
			while(j < test.length) {
				if(test[i].compareTo(test[j]) > 0) {
					temp = test[j];
					test[j] = test[i];
					test[i] = temp;
				}
				j++;
			}
			i++;
		}
		i = 0;
		while(i < test.length) {
			System.out.println(test[i]);
			i++;
		}
	}
	
}
