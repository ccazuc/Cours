package boules_a_neige;

import java.util.ArrayList;

public class MaBelleCollection {

	private static ArrayList<BouleANeige> snowBall = new ArrayList<BouleANeige>();
	
	public MaBelleCollection() {}
	
	public static int taille() {
		return snowBall.size();
	}
	
	public static BouleANeige boule(int index) {
		if(index >= 0 && index < taille()) {
			return snowBall.get(index);
		}
		return null;
	}
	
	public static void affiche() {
		int i = 0;
		while(i < taille()) {
			snowBall.get(i).affiche();
			i++;
		}
	}
	
	public static void research(String desc) {
		int i = 0;
		while(i < taille()) {
			if(snowBall.get(i).getDescription().equals(desc)) {
				snowBall.get(i).affiche();
			}
			i++;
		}
	}
	
	public static void filtre(String desc) {
		int i = 0;
		while(i < taille()) {
			if(snowBall.get(i).equals(desc)) {
				snowBall.remove(i);
				i--;
				continue;
			}
			i++;
		}
	}
	
	public static ArrayList<BouleANeige> retireDoublon() {
		int i = 0;
		int j = 0;
		ArrayList<BouleANeige> doublon = new ArrayList<BouleANeige>();
		first:
		while(i < taille()) {
			j = 0;
			while(j < taille()) {
				if(snowBall.get(j).egaleA(snowBall.get(i))) {
					doublon.add(snowBall.get(j));
					continue first;
				}
				j++;
			}
			i++;
		}
		return doublon;
	}
}
