package hsa2;

import java.awt.Color;
import java.lang.Math.*;
import java.util.Random;
import java.awt.Rectangle;


public class AnimationMain {

	public static Color getColor() {
		int random =(int)Math.floor(Math.random()*(5-1+1)+1);
		System.out.println(random);
		
		Color color = Color.RED;
		
		if(random == 1) {
			color = Color.RED;}
		else if(random == 2)
			color = Color.BLUE;
		else if(random == 3)
			color = Color.YELLOW;
		else if(random == 4)
			color = Color.GREEN;
		else if(random == 5)
			color = Color.MAGENTA;		
	
		return color;
}


	
	public static void main(String[] args) throws InterruptedException {
		GraphicsConsole screenSaver = new GraphicsConsole(2000, 1000);

		int x = 0;
		int y = 0;

		int width = 200;
		int height = 200;

		screenSaver.setBackgroundColor(Color.BLACK);
		screenSaver.clear();
		screenSaver.setColor(Color.RED);
		
		
		while(y < 1000) {
			while(x < 2000) {
				screenSaver.setColor(getColor());
				screenSaver.fillMapleLeaf(x, y, width, height);
				x += width;
			}
			x = 0;
			y += height;
		}
	

	}
}