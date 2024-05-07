package Java;

abstract class GeometricObject {
	static void PrintTest() {
		System.out.println("Static methods can be reachable from main to abstract classes.");
	}

	abstract double getArea();
}

class Circle extends GeometricObject {
	private int radius;

	void setPerimeter(int radius) {
		this.radius = radius;
	}

	double getArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends GeometricObject {
	private int width, height;

	void setPerimeter(int width, int height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return Math.PI * width * height;
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		/* GeometricObject go = new GeometricObject(); */
		/* Can't create object from abstract classes */
		GeometricObject.PrintTest();

		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();

		System.out.println(circle.getArea());
		System.out.println(rectangle.getArea());
	}
}
