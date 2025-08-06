package edu.basic;

import java.util.Scanner;
import java.time.Year;

public class AgeFinder {

	 public static void main(String[] args) {
	        // Start the program
	        System.out.println("Welcome to the Age Finder!");

	        Scanner scanner = new Scanner(System.in);

	        // Ask for birth year
	        System.out.print("Please enter your birth year in 4 digit( in formate YYYY): ");
	        int birthYear = scanner.nextInt();

	        // Get the current year from the system
	        int systemYear = Year.now().getValue();

	        // Ask the user to use system year or input manually
	        System.out.print("The current year is " + systemYear + ". Press 'Y' to use it, or 'N' to enter your own: ");
	        String choice = scanner.next();

	        int currentYear;
	        if (choice.equalsIgnoreCase("Y")) {
	            currentYear = systemYear;
	        } else {
	            System.out.print("Please enter the current year: ");
	            currentYear = scanner.nextInt();
	        }


	        // Calculate age
	        int age = currentYear - birthYear;

	        // Display age
	        System.out.println("You are " + age + " years old.");

	        // Check if 18 or older
	        if (age >= 18) {
	            System.out.println("You’ve evolved beyond your juvenile DLC.");
	        } else {
	            System.out.println("Hello Juvenile, how you doing.");
	        }

	        // End the program
	        System.out.println("Thank you for using the Age Finder. Goodbye!");
	        scanner.close();
	    }
}

/**

Start the program
Display a welcome message
Ask the user for their birth year
Get the current year
Calculate the user’s age
Display the calculated age
Check if the user is 18 or older
Display correct analysis
End the program

*/