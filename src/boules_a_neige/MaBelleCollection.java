package boules_a_neige;

import java.util.ArrayList;

public class MaBelleCollection {

	private static ArrayList<BouleANeige> snowBall = new ArrayList<BouleANeige>();
	
	public MaBelleCollection() {}
	
	/**
	 * return snowBall list's size
	 * @return
	 */
	public static int taille() {
		return snowBall.size();
	}
	
	/**
	 * return the snowBall at the given index
	 * @param index
	 * @return
	 */
	public static BouleANeige boule(int index) {
		if(index >= 0 && index < taille()) {
			return snowBall.get(index);
		}
		System.out.println("invalid index");
		return null;
	}
	
	/**
	 * display all snowBall in the list
	 */
	public static void affiche() {
		int i = 0;
		while(i < taille()) {
			snowBall.get(i).affiche();
			i++;
		}
	}
	
	/**
	 * display snowBall with the same description
	 * @param desc
	 */
	public static void recherche(String desc) {
		int i = 0;
		while(i < taille()) {
			if(snowBall.get(i).getDescription().equals(desc)) {
				snowBall.get(i).affiche();
			}
			i++;
		}
	}
	
	/**
	 * remove every snowBall in the list with the same description
	 * @param desc
	 */
	public static void filtre(String desc) {
		int i = 0;
		while(i < taille()) {
			if(snowBall.get(i).getDescription().equals(desc)) {
				snowBall.remove(i);
				i--;
				continue;
			}
			i++;
		}
	}
	
	/**
	 * delete every snowBall copy in the list
	 * @return
	 */
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
					i++;
					continue first;
				}
				j++;
			}
			i++;
		}
		return doublon;
	}
}
