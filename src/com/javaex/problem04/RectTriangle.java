package com.javaex.problem04;

public class RectTriangle extends Shape  {
	private int width;
	private int height;
	
	public RectTriangle() {}
	
	public RectTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height * 1/2;
	}
	
	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(width*width + height*height);
	}
	
	
	
	
	
}
