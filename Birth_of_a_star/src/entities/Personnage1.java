package entities;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import resources.Coordinates;
import resources.DisplayInfo;
import resources.Rectangle;

public class Personnage1 extends Human{

	static boolean charged = false;
	static BufferedImage sprite = null;
	
	@Override
	public void display(DisplayInfo info, Coordinates position, Graphics2D g, ImageObserver io) {

		if(!charged) {
			
			try {
				sprite = ImageIO.read(new File("Images/Sprites/perso1.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(sprite != null)
				charged = true;
			
		}
		
		if(sprite != null)
			info.displayImage(sprite, position, g, new Rectangle(coords,32,32), io);
		else
			System.err.println("Erreur image");
		
	}

	@Override
	protected void move(Movement direction) {
		// TODO Auto-generated method stub
		
	}

}
