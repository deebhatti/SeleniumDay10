package inheritance;

import demo2.Management;

public class HR extends Management {
	
	
	
	int bonus = 12000;
	
	public static void main(String[] args) {
		HR Tim = new HR();
		System.out.println("Salary of Tim = $ " + Tim.salary);
	}

}
