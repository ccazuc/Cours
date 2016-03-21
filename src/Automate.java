import java.util.ArrayList;
import java.util.Scanner;

public class Automate {

	private static ArrayList<String> line = new ArrayList<String>();
	private static Scanner input = new Scanner(System.in);
	private static StringBuilder builder = new StringBuilder();
	
	public static void main(String[] args) {
		System.out.println("Entrez le nombre d'itérations");
		int iteration = input.nextInt();
		System.out.println("Entrez la règle");
		Integer rule = input.nextInt();   
		String ruleString = Integer.toBinaryString(rule);
		line.add("...........*......................*.....................*......................*.....................*............................*...........................*");
		int i = 0;
		int j = 0;
		int k = 0;
		int voisins = 0;
		while(i < iteration) {
			j = 0;
			while(j < line.get(0).length()) {
				voisins = voisinage(line.get(i), j);
				k = 0;
				while(k <= ruleString.length()+1) {
					if(((rule >> k) & 1) == 0 && voisins == k) {
						builder.append(".");
					}
					if(((rule >> k) & 1) == 1 && voisins == k) {
						builder.append("*");
					}
					k++;
				}
				/*if(((rule >> 0) & 1) == 0 && voisins == 0) {
					builder.append(".");
				}
				if(((rule >> 0) & 1) == 1 && voisins == 0) {
					builder.append("*");
				}
				if(((rule >> 1) & 1) == 0 && voisins == 1) {
					builder.append(".");
				}
				if(((rule >> 1) & 1) == 1 && voisins == 1) {
					builder.append("*");
				}
				if(((rule >> 2) & 1) == 0 && voisins == 2) {
					builder.append(".");
				}
				if(((rule >> 2) & 1) == 1 && voisins == 2) {
					builder.append("*");
				}
				if(((rule >> 3) & 1) == 0 && voisins == 3) {
					builder.append(".");
				}
				if(((rule >> 3) & 1) == 1 && voisins == 3) {
					builder.append("*");
				}
				if(((rule >> 4) & 1) == 0 && voisins == 4) {
					builder.append(".");
				}
				if(((rule >> 4) & 1) == 1 && voisins == 4) {
					builder.append("*");
				}
				if(((rule >> 5) & 1) == 0 && voisins == 5) {
					builder.append(".");
				}
				if(((rule >> 5) & 1) == 1 && voisins == 5) {
					builder.append("*");
				}
				/*if(voisins == 1 || voisins == 3) {
					builder.append("*");
				}
				else if(voisins == 2 || voisins == 0 || voisins == 5 || voisins == 4) {
					builder.append(".");
				}*/
				j++;
			}
			line.add(builder.toString());
			System.out.println(line.get(i));
			builder.delete(0, line.get(i).length());
			i++;
		}
	}
	
	private static int voisinage(String string, int i) {
		int j = 0;
		int voisin = 0;
		if(i >= 2 && i <= string.length()-2) {
			j = -2;
		}
		else if(i <= 2) {
			j = 0;
		}
		else {
			j = -1;
		}
		while(i+j < string.length() && j <= 2 && i+j >= 0) {
			if(string.substring(i+j, i+j+1).equals("*")) {
				voisin++;
			}
			j++;
		}
		return voisin;
	}
}
