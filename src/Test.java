import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		/*Scanner input = new Scanner(System.in);
		//System.out.println("string = ");
		//String number = input.nextLine();
		
		int k;
		String number = "72487085";
		String temp;
		int result = 0;
		int i = number.length();
		
		while(i >= 1) {
			if(i%2 != 0) {
				k = Integer.parseInt(number.substring(i-1, i));
				k*= 2;
				if(k >= 10) {
					String tempNumber = String.valueOf(k);
					k = Integer.parseInt(tempNumber.substring(0, 1))+Integer.parseInt(tempNumber.substring(1, 2));
				}
				System.out.println(k);
				result+= k;
			}
			else  {
				k = Integer.parseInt(number.substring(i-1, i));
				System.out.println(k);
				result+= k;
			}
			i--;
		}
		System.out.println(result);
		input.close();*/
		
		int x = 0;
		int y = 0;
		int result;
		int minX = 0;
		int minY = 0;
		int minResult = 0;
		while(x <= 10) {
			while(x+y <= 10) {
				result = 4*x+3*y-5*x*y;
				System.out.println(result+" x = "+x+" et y ="+y);
				if(result < minResult) {
					minX = x;
					minY = y;
					minResult = result;
				}
				y++;
			}
			y = 0;
			x++;
		}
		/*while(x < 10) {
			result = 4*x;
			System.out.println(result);
			if(result < minResult) {
				minX = x;
				minY = 0;
				minResult = result;
				
			}
			x++;
		}
		x = 0;
		while(y < 10) {
			result = 3*y;
			System.out.println(result);
			if(result < minResult) {
				minX = 0;
				minY = y;
				minResult = result;
				
			}
			y++;
		}
		y = 0;
		while(x+y <= 8) {
			result = 4*x+3*y-5*x*y;
			System.out.println(result);
			if(result < minResult) {
				minX = x;
				minY = y;
				minResult = result;
			}
			x++;
			y++;
		}*/
		System.out.println("Le minimum est "+minResult+" pour x = "+minX+" et y = "+minY);
	}
}
