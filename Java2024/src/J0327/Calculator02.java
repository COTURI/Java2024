package J0327;

public class Calculator02 {

	double areaRectangle(double width) {
		return width * width;
	}

	double areaRectangle(double width, double height) {
		return width * height;
	}

	double areaRectangle(double width, double height, double width2) {
		return ((width * height) + (height * width2) + (width2 * width)) * 2;
	}

	public static void main(String[] args) {
		Calculator02 myCalc = new Calculator02();

		double result1 = myCalc.areaRectangle(4.0);
		double result2 = myCalc.areaRectangle(4.0, 6.0);
		double result3 = myCalc.areaRectangle(2.0, 3.0, 4.0);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
}
