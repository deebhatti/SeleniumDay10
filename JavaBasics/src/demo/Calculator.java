package demo;

public class Calculator {

	public Calculator() {

	}

	public void add(int a, int b) { // a and b are called as Formal Parameters
		System.out.println(a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		Calculator basicCal = new Calculator();

		basicCal.add(10, 20); // 10 and 20 are called as Actual Parameters
		basicCal.subtract(50, 40);
		basicCal.divide(100, 20);
		basicCal.multiply(16, 8);

	}

}
