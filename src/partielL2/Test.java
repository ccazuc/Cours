package partielL2;

public class Test {
	public static void main(String args[]) {
		int[] test = new int[] {3, -7, 0, 6, 5, 0, -2, -3 , 0, -2, 4, -5, 3, 6, -7, 9, -3};
		int i = 0;
		int neg = 0;
		int pos = 1;
		int n = test.length;
		while(i < n-pos+1) {
			if(test[i] < 0) {
				int temp = test[neg];
				test[neg] = test[i];
				test[i] = temp;
				neg++;
			}
			else if(test[i] > 0) {
				int temp = test[n-pos];
				test[n-pos] = test[i];
				test[i] = temp;
				pos++;
				continue;
			}
			i++;
		}
	}
}
