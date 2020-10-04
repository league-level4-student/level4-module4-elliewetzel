package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	BufferedImage image;
	@Override
	public void draw(Graphics g) {
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("One Eyed Racoon.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image,x,y,width,height,null);
	}
	
}