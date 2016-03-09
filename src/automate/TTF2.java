package automate;


import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

import org.newdawn.slick.util.ResourceLoader;

public class TTF2 {

	public static TTF buttonFont;
	public static TTF spellName;
	public static TTF hpAndMana;
	public static TTF playerName;
	public static TTF characterFrameStats;
	public static TTF font;
	public static TTF font2;
	public static TTF font3;
	public static TTF font4;
	public static TTF font5;
	public static TTF coin;
	public static TTF coinContainer;
	public static TTF statsName;
	public static TTF itemName;
	public static TTF itemNumber;
	public static TTF talent;
	
	public static void init() throws FontFormatException, IOException {
		InputStream inputStream = ResourceLoader.getResourceAsStream("MORPHEUS.TTF");
		Font awtFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
		awtFont = awtFont.deriveFont(18f);
	    font = new TTF(awtFont, true);
	    
	    awtFont = new Font("MORPHEUS", Font.BOLD, 11);
	    font2 = new TTF(awtFont, true);
	    
	    awtFont = new Font("MORPHEUS", Font.BOLD, 20);
	    font3 = new TTF(awtFont, true);
	}
}
