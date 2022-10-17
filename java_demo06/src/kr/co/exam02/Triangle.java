package kr.co.exam02;

public class Triangle {
	double base;
	double height;
	double area;
	double circum;

	public Triangle(double base) {
		this.base = base;
		this.height = base;
		this.area = base * height / 2;
		this.circum = base + height + Math.sqrt(base*base + height*height);
	}

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		this.area = base * height / 2;
		this.circum = base + height + Math.sqrt(base*base + height*height);
	}
	
	public double getBase() {
		return this.base;
	}
	public double getHeight() {
		return this.height;
	}
	public double getArea() {
		return this.area;
	}
	public double getCircum() {
		return this.circum;
	}
}
