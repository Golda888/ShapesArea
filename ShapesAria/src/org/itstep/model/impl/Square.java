package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Square implements Shape {
	private int side;

	@Override
	public void printArea() {
		
	System.out.println("Area of this square is "  + side * side);
		}

	public int getSquare() {
		return side;
	}
	
	public void setSquare(int square) {
}

}