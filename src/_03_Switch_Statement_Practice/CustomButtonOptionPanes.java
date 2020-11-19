package _03_Switch_Statement_Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		
		switch (input) {
		case 0:
			System.out.println("eat a sundae");
			break;
		case 1:
			System.out.println("go to work");
			break;
		case 2:
			System.out.println("eat a taco");
			break;
		case 3:
			System.out.println("it's a wacky day");
			break;
		case 4:
			System.out.println("go to the grocery store");
			break;
		case 5:
			System.out.println("be annoying");
			break;
		case 6:
			System.out.println("drink a milkshake");
			break;
		case 7:
			System.out.println("eat a lot of donuts");
			break;
		default:
			System.out.println("Something went wrong :(");

		}
	}
}
