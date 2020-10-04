package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	int loc = 0;
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}
	public void update() {
		x = (int) (x+Math.cos(loc)*50.0);
		y = (int) (y+Math.sin(loc)*50.0);
		loc++;
	}
}