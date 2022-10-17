package kr.co.exam02;

public class Quadrangle {
	double base;
	double height;
	double area;
	double circum;

	public Quadrangle(double base) {
		this.base = base;
		this.height = base;
		this.area = base * base;
		this.circum = base * 4;
	}

	public Quadrangle(double base, double height) {
		this.base = base;
		this.height = height;
		this.area = base * height;
		this.circum = (base + height) * 2;
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
