package boules_a_neige;

public class BouleANeige {

	private String description;
	private int width;
	private int height;
	
	/**
	 * Create a new snowBall
	 * @param description
	 * @param width
	 * @param height
	 */
	public BouleANeige(String description, int width, int height) {
		this.description = description;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Display a snowBall's description, width and height
	 */
	public void affiche() {
		System.out.println(description+" : width : "+width+", height  : "+height);
	}
	
	/**
	 * return snowBall's description
	 * @return
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * return snowBall's width
	 * @return
	 */
	public int getWidth() {
		return this.width;
	}
	
	
	/**
	 * return snowBall's height
	 * @return
	 */
	public int getHeight() {
		return this.height;
	}
	
	/**
	 * return true if both snowBall are equals
	 * @param snowBall
	 * @return
	 */
	public boolean egaleA(BouleANeige snowBall) {
		if(this.description.equals(snowBall.getDescription()) && this.width == snowBall.getWidth() && this.height == snowBall.getHeight()) {
			return true;
		}
		return false;
	}
}
