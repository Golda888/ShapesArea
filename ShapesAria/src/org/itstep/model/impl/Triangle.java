package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Triangle implements Shape { 
	private int height;
	private int base;
	
	@Override
	
	public void printArea( ) {
		
System.out.println("Area of this trianle is" + height * base);

	}
	public int getHeight() {
		return height;
		
	}
	public void setHeight(int height) {
	this.height = height;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
	
		
		
	}
	

}