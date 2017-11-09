package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Circle implements Shape {
	private int radius;

	@Override
	public void printArea() {

		System.out.println("Aria of this circle is)" + Math.PI * radius * radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
