package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Square implements Shape {
	private int square;

	@Override
	public void printArea() {
		
	System.out.println("Area of this square is)" + Math.PI * square * square);
		}

	public int getSquare() {
		return square;
	}
	
	public void setSquare(int square) {
}

}