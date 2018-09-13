package demo;

import demo2.Management;

public class Test extends Management {
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		Test obj = new Test();
		Days obj1 = new Days();
		basicCal.add(90, 10);
		obj1.day();
		//obj.day();
		Shapes.shapeOfTheFigure();
	}

}
