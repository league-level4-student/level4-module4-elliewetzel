package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

	public class MouseMorph extends Polymorph{
		MouseMorph(int x, int y, int width, int height) {
			super(x, y, width, height);
		}

		@Override
		public void draw(Graphics g) {
			g.setColor(Color.magenta);
			g.fillRect(x, y, width, height);
		}
		public void update() {
			x = (MouseInfo.getPointerInfo().getLocation().x)-30;
			y = (MouseInfo.getPointerInfo().getLocation().y)-55;
		}
	}