package edu.basic;

import java.util.Scanner;

public class GradebookCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] majorGrades = new double[4];
        double[] minorGrades = new double[6];
        double[] practiceGrades = new double[6];

        double majorTotal = 0, minorTotal = 0, practiceTotal = 0;

        System.out.println("Welcome to the Semester Grade Calculator");
        System.out.println("Please enter your grades below:");

        // Major Grades (55%)
        System.out.println("Enter 4 Major Grades:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Major Grade " + (i + 1) + ": ");
            majorGrades[i] = scanner.nextDouble();
            majorTotal += majorGrades[i];
        }

        // Minor Grades (35%)
        System.out.println("\nEnter 6 Minor Grades:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Minor Grade " + (i + 1) + ": ");
            minorGrades[i] = scanner.nextDouble();
            minorTotal += minorGrades[i];
        }

        // Practice Grades (10%)
        System.out.println("\nEnter 6 Practice Grades:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Practice Grade " + (i + 1) + ": ");
            practiceGrades[i] = scanner.nextDouble();
            practiceTotal += practiceGrades[i];
        }

        // Averages
        double majorAverage = majorTotal / 4;
        double minorAverage = minorTotal / 6;
        double practiceAverage = practiceTotal / 6;

        // Weighted contributions
        double majorWeighted = majorAverage * 0.55;
        double minorWeighted = minorAverage * 0.35;
        double practiceWeighted = practiceAverage * 0.10;

        double finalGrade = majorWeighted + minorWeighted + practiceWeighted;

        // Output breakdown
        System.out.println("\n--- Grade Breakdown ---");
        System.out.printf("Major Average: %.2f (Weighted: %.2f)\n", majorAverage, majorWeighted);
        System.out.printf("Minor Average: %.2f (Weighted: %.2f)\n", minorAverage, minorWeighted);
        System.out.printf("Practice Average: %.2f (Weighted: %.2f)\n", practiceAverage, practiceWeighted);
        System.out.printf(">> Final Semester Grade: %.2f\n", finalGrade);

        scanner.close();
    }
}
/**

Start the program  
Display a welcome message  

Ask the user to enter 4 major grades  
Store and total the major grades  

Ask the user to enter 6 minor grades  
Store and total the minor grades  

Ask the user to enter 6 practice grades  
Store and total the practice grades  

Calculate the average of major grades  
Calculate the average of minor grades  
Calculate the average of practice grades  

Calculate the weighted score for major grades (55%)  
Calculate the weighted score for minor grades (35%)  
Calculate the weighted score for practice grades (10%)  

Calculate the final semester grade by adding all weighted scores  

Display the major average and its weighted contribution  
Display the minor average and its weighted contribution  
Display the practice average and its weighted contribution  
Display the final semester grade  

End the program  

*/