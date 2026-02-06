package com.ClassObject;


class Cylinder{
	int redius;
	int height;
	
	public int getRedius() {
		return redius;
	}
	public void setRedius(int r) {
		redius = r;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int h) {
		height = h;
	}
	
}
public class FindCylinderHeightRadius {
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setHeight(12);
		c.setRedius(6);
		
		System.out.println(c.getHeight());
		System.out.println(c.getRedius());
		

		
		
		
		
		
		
	}
}
