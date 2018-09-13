package demo;

public class Shapes {
	
	int length;
	int breadth;
	
	public Shapes() {
		length = 4;
		breadth = 3;
	}
	
	public Shapes(int a, int b) { //Parameterised Constructor
		length = a;
		breadth = b;
	}
	
	public void calculateArea() {
		String name = "Deepinder";
		System.out.println("Area of the rectangle = " + (length*breadth) + " cm.sq");
	}
	
	public static void shapeOfTheFigure() {
		System.out.println("Shape of the figure = Rectangle");
	}
	
	public static void main(String[] args) {
//		Shapes rectangle = new Shapes();		
//		rectangle.calculateArea();
		
		Shapes rectangle2 = new Shapes(10,8);		
		rectangle2.calculateArea();
		
		shapeOfTheFigure();
		
		
	}
	
	

}
