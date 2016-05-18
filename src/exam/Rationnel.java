package exam;

public class Rationnel {

	int numerateur;
	int denominateur;
	int[] number;
	
	/**
	 * Create a new <code>Rationnel</code> with two given integer
	 * @param numerateur
	 * @param denominateur
	 */
	public Rationnel(int numerateur, int denominateur) { // Le denominateur doit être différent de 0
		this.numerateur = numerateur;
		if(denominateur != 0) {
			this.denominateur = denominateur;
		}
		else {
			System.out.println("Denominateur has to be different of 0");
		}
	}
	
	/**
	 * Create a new integer
	 * @param numerateur
	 */
	public Rationnel(int numerateur) {
		this.numerateur = numerateur;
		this.denominateur = 1;
	}
	
	/**
	 * Alternativ method which store numerator and denominator into an array
	 * @param number
	 */
	public Rationnel(int[] number) {
		if(number.length != 2) {
			System.out.println("Array size must be equal to 2");
		}
		else {
			this.number = number;
		}
	}
	
	/**
	 * return the numerateur of a <code>Rationnel</code>
	 * @return <code>int</code>
	 */
	public int getNumerateur() {
		return numerateur;
	}
	
	/**
	 * set the numerateur with a given integer
	 * @param numerateur
	 */
	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}
	
	/**
	 * returns the denominateur of a <code>Rationnel</code>
	 * @return <code>int</code>
	 */
	public int getDenominateur() {
		return this.denominateur;
	}
	
	/**
	 * set the denominateur with a given integer
	 * @param denominateur
	 */
	public void setDenominateur(int denominateur) {
		if(denominateur != 0) {
			this.denominateur = denominateur;
		}
		else {
			System.out.println("Denominator has to be different of 0");
		}
	}
	
	/**
	 * returns a String with a numerateur/denominateur format
	 */
	public String toString() {
		return this.numerateur+"/"+this.denominateur;
	}
	
	/**
	 * add one existing <code>Rationnel</code> to a given <code>Rationnel</code>
	 * @param number
	 * @return <code>Rationnel</code>
	 */
	public Rationnel add(Rationnel number) {
		return new Rationnel(this.numerateur*number.getDenominateur()+this.denominateur*number.getNumerateur(), this.denominateur*number.getDenominateur());
	}
	
	/**
	 * multiply an existing <code>Rationnel</code> with a given <code>Rationnel</code>
	 * @param number
	 * @return <code>Rationnel</code>
	 */
	public Rationnel mult(Rationnel number) {
		return new Rationnel(this.numerateur*number.getNumerateur(), this.denominateur*number.getDenominateur());
	}
	
	/**
	 * returns the real number of the division of an existing <code>Rationnel</code>
	 * @return <code>double</code>
	 */
	public double toReal() {
		return this.numerateur/this.denominateur;
	}
}
