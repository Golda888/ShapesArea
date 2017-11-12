package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Triangle implements Shape { 
	private int height;
	
	@Override
	
	public void printArea( ) {
		
System.out.println("Area of this trianle is)" + Math.PI * height * height);

	}
	public int getHeight() {
		return height;
		
	}
	public void setHeight(int height) {
	this.height = height;
	
		
		
	}
	

}