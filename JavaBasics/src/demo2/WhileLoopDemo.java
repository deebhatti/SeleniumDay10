package demo2;

import java.util.Scanner;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int correctPIN = 1234;
		int tries = 0;
		
		System.out.println("Please enter your ATM PIN ");
		int enteredPIN = keyboard.nextInt();
		tries++;
		
		while((enteredPIN != correctPIN) && tries<3) {
			System.out.println("The PIN you entered is incorrect. Please try again");
			enteredPIN = keyboard.nextInt();
			tries++;
		}
		
		if((enteredPIN != correctPIN) && tries == 3) {
			System.out.println("Your ATM card has been blocked because you have exceeded the allowed tries");
		}
		
		else if(tries <=3) {
			System.out.println("Welcome to ABC Bank.");
		}
		
		
	}

}
