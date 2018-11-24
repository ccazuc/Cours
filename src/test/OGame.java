package test;

public class OGame {

	public static void main(String[] args)
	{
		float factor = .3f;
		for (int i = 0; i < 14; ++i)
		{
			System.out.println("Métal: " + (10800000 + 8000000 * 1.9f * factor) + ", cristal: " + (10295000 + 8000000 * 1.4f * (1 - factor)) + ", taux: " + factor + "/" + (1 - factor));
			factor += .05f;
		}
	}
}
