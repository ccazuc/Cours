package test;

public class OgameMine {

	public final static float METAL_TO_CRISTAL = 1.5f;
	public final static float CRISTAL_TO_DEUT = 1.5f;
	private enum MineType
	{
		METAL("Metal"),
		CRISTAL("Cristal"),
		DEUTERIUM("Deuterium"),
		
		;
		
		private final String name;
		
		private MineType(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return (this.name);
		}
		
	}
	
	private class Mine
	{
		private final int level;
		private final MineType type;
		private int prod;
		private int prodDelta;
		private long cost;
		
		public Mine(int level, MineType type)
		{
			this.level = level;
			this.type = type;
			if (this.type == MineType.METAL)
			{
				this.prod = getMetalMineProd(this.level);
				this.prodDelta = this.prod - getMetalMineProd(this.level - 1);
				this.cost = (long)(60 * Math.pow(1.5, this.level - 1) + 15 * Math.pow(1.5, this.level - 1) * 1.5);
			}
			else if (this.type == MineType.CRISTAL)
			{
				this.prod = getCristalMineProd(this.level);
				this.prodDelta = this.prod - getCristalMineProd(this.level - 1);
				this.cost = (long)(48 * Math.pow(1.6, this.level - 1) + 24 * Math.pow(1.6, this.level - 1) * 1.5);
			}
			else if (this.type == MineType.DEUTERIUM)
			{
				this.prod = getDeuteriumMineProd(this.level);
				this.prodDelta = this.prod - getDeuteriumMineProd(this.level - 1);
				this.cost = (long)(225 * Math.pow(1.5, this.level - 1) + 75 * Math.pow(1.5, this.level - 1) * 1.5);
			}
		}
		
		public void printRentability()
		{
			System.out.println(this.type.getName() + " " + this.level + ": " + (cost / prodDelta / 24) + " days");
			System.out.println("Cost: " + cost + ", prod: " + prod + ", prodDelta: " + prodDelta);
		}
	}
	
	public static int getMetalMineProd(int level)
	{
		return ((int)(30 * 3 * level * Math.pow(1.1, level)));
	}
	
	public static int getCristalMineProd(int level)
	{
		return ((int)(20 * 3 * level * Math.pow(1.1, level) * 1.5));
	}
	
	public static int getDeuteriumMineProd(int level)
	{
		return ((int)(10 * 3 * level * Math.pow(1.1, level) * (-0.002 * 43 + 1.28) * 1.5 * 1.5));
	}
	
	public static void main(String[] args)
	{
		OgameMine ogameMine = new OgameMine();
		Mine mine = ogameMine.new Mine(32, MineType.METAL);
		Mine mine1 = ogameMine.new Mine(27, MineType.CRISTAL);
		Mine mine2 = ogameMine.new Mine(27, MineType.DEUTERIUM);
		mine.printRentability();
		mine1.printRentability();
		mine2.printRentability();
	}
}
