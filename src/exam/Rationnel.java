package exam;

public class Rationnel {

	int numerateur;
	int denominateur;
	int[] number;
	
	/**
	 * Create a new <code>Rationnel</code> with two given integer
	 */
	public Rationnel(int numerateur, int denominateur) { // Le denominateur doit être différent de 
		this.numerateur = numerateur;
		if(denominateur != 0) {
			this.denominateur = denominateur;
		}
		else {
			System.out.println("Error, le dénominateur doit être différent de 0");
		}
	}
	
	/**
	 * Create a new integer
	 */
	public Rationnel(int numerateur) {
		this.numerateur = numerateur;
		this.denominateur = 1;
	}
	
	/**
	 * Méthode alternative qui stock le numerateur et denominateur dans un tableau d'int
	 */
	public Rationnel(int[] number) {
		if(number.length != 2) {
			System.out.println("Le tableau doit être de taille 2");
		}
		else {
			this.number = number;
		}
	}
	
	/**
	 * return the numerateur of a <code>Rationnel</code>
	 */
	public int getNumerateur() {
		return numerateur;
	}
	
	/**
	 * set the numerateur with a given integer
	 */
	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}
	
	/**
	 * return the denominateur of a <code>Rationnel</code>
	 */
	public int getDenominateur() {
		return this.denominateur;
	}
	
	/**
	 * set the denominateur with a given integer
	 */
	public void setDenominateur(int denominateur) {
		if(denominateur != 0) {
			this.denominateur = denominateur;
		}
		else {
			System.out.println("Le dénominateur doit être différent de 0");
		}
	}
	
	/**
	 * return a String with a numerateur/denominateur format
	 */
	public String toString() {
		return this.numerateur+"/"+this.denominateur;
	}
	
	/**
	 * add one existing <code>Rationnel</code> to a given <code>Rationnel</code>
	 */
	public Rationnel add(Rationnel number) {
		return new Rationnel(this.numerateur*number.getDenominateur()+this.denominateur*number.getNumerateur(), this.denominateur*number.getDenominateur());
	}
	
	/**
	 * multiply an existing <code>Rationnel</code> with a given <code>Rationnel</code>
	 */
	public Rationnel mult(Rationnel number) {
		return new Rationnel(this.numerateur*number.getNumerateur(), this.denominateur*number.getDenominateur());
	}
	
	/**
	 * return the real number of the division of an existing <code>Rationnel</code>
	 */
	public double toReal() {
		return this.numerateur/this.denominateur;
	}
}
