package automate;
import java.awt.FontFormatException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;

public class Automate {

	private static ArrayList<String> line = new ArrayList<String>();
	private static boolean hover1;
	private static boolean hover2;
	private static String inputLine;
	private static Scanner input = new Scanner(System.in);
	
	public static void context2D() throws LWJGLException, IOException {
		GL11.glEnable(GL11.GL_TEXTURE_2D);            
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);                
        GL11.glClearDepth(1);     
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glViewport(0,0,Display.getWidth(),Display.getHeight());
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, Display.getWidth(), Display.getHeight(), 0, 1, -1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadIdentity();
	}
	private static void loop() throws FontFormatException, IOException, LWJGLException, SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, InterruptedException, CloneNotSupportedException {
		//System.setProperty("org.lwjgl.opengl.Window.undecorated", "false");
		//Display.setDisplayMode(new DisplayMode(1200, 800));
		Display.setDisplayMode(new DisplayMode(1200, 930));
		//setDisplayMode(1920, 1080, true);
		//Display.setFullscreen(true);
		Display.create();
		Display.setTitle("Automate");
		Display.setResizable(true);
		Display.setDisplayMode(new DisplayMode(1200, 930));
		//Display.setFullscreen(true);
		TTF2.init();
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		while(!Display.isCloseRequested()) {
			context2D();
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			while(Mouse.next()) {
				mouseEvent();
			}
			draw();
			Display.update();
			Display.sync(60);
		}
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, FontFormatException, IOException, LWJGLException, SQLException, InterruptedException, CloneNotSupportedException {
		loop();
	}
	
	private static void draw() {
		Draw.drawColorQuad(0, 0, 150, 50, Color.white);
		TTF2.font.drawString(50, 10, "Iterate", Color.black);
		Draw.drawColorQuad(0, 60, 150, 50, Color.white);
		TTF2.font.drawString(44, 70, "Enter line", Color.black);
	}
	
	private static void mouseEvent() {
		if(mouseX() >= 0 && mouseX() <= 150 && mouseY() >= 0 && mouseY() <= 50) {
			hover1 = true;
		}
		else if(mouseX() >= 0 && mouseX() <= 150 && mouseY() >= 60 && mouseY() <= 110) {
			hover2 = true;
		}
		if(Mouse.getEventButtonState()) {
			if(Mouse.getEventButton() == 0) {
				if(hover1) {
					
				}
				else if(hover2) {
					System.out.println("Enter line");
					line.add(input.nextLine());
				}
			}
		}
		
	}
	
	public static int mouseX() {
		return Mouse.getX();
	}
	
	public static int mouseY() {
		return Display.getHeight()-Mouse.getY();
	}
}
