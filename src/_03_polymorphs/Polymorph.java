package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    /*public Polymorph(int x2, int y2, int width, int height) {
		// TODO Auto-generated constructor stub
	}*/

	public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
