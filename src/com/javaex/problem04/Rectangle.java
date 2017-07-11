package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable{
	private double width;
	private double height;
	
	public Rectangle() {}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void resize(double size) {
		width = width * size;
		height = height * size;
		
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}
	
	

}
