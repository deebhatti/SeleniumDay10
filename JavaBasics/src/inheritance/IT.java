package inheritance;

import demo2.Management;

public class IT extends Management {
	
	@Override
	public void day() {
		System.out.println("Today is Thursday");
	}
	
	
	
	int bonus = 10000;
	
	public static void main(String[] args) {
		IT John = new IT();
		System.out.println("Bonus of John = $ " + John.bonus);
		System.out.println("Salary of John = $ " + John.salary);
		
		John.day();
		
	}

}
