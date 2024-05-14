package Examples;

abstract class GeometricObject {
	String color;
	double[] sideValue = new double[3];
	boolean fillRate;

	void SetValues(double side1, double side2, double side3) {
		sideValue[0] = side1;
		sideValue[1] = side2;
		sideValue[2] = side3;
	}

	void SetColor(String color) {
		this.color = color;
	}

	void SetFillRate(boolean fillRate) {
		this.fillRate = fillRate;
	}

	abstract double GetArea();

	abstract double GetPerimeter();

	abstract boolean GetFillRate();
}

class Triangle extends GeometricObject {

	double GetArea() {
		return sideValue[0] * sideValue[1] / 2;
	}

	double GetPerimeter() {
		return sideValue[0] + sideValue[1] + sideValue[2];
	}

	boolean GetFillRate() {
		return fillRate;
	}
}

public class TestTriangle {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();

		triangle.SetValues(3.0, 4.0, 5.0);
		triangle.SetColor("Red");
		triangle.SetFillRate(true);

		System.out.println(triangle.GetArea());
		System.out.println(triangle.GetPerimeter());
		System.out.println(triangle.GetFillRate());
	}
}