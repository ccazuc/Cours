package boules_a_neige;

public class BouleANeige {

	private String description;
	private int width;
	private int height;
	
	public BouleANeige(String description, int width, int height) {
		this.description = description;
		this.width = width;
		this.height = height;
	}
	
	public void affiche() {
		System.out.println(description+" : width : "+width+", height  : "+height);
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public boolean egaleA(BouleANeige snowBall) {
		if(this.description.equals(snowBall.getDescription()) && this.width == snowBall.getWidth() && this.height == snowBall.getHeight()) {
			return true;
		}
		return false;
	}
}
