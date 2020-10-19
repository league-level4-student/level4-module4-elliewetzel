package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
    protected int y;
    protected int width;
    protected int height;
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    int getX(){
    	return x;
    }
    void setX(int newX) {
    	x = newX;
    }
    int getY(){
    	return y;
    }
    void setY(int newY) {
    	y = newY;
    }
    int getWidth(){
    	return width;
    }
    void setWidth(int newWidth) {
    	width = newWidth;
    }
    int getHeight(){
    	return height;
    }
    void setHeight(int newHeight) {
    	height = newHeight;
    }
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}