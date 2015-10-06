// Class:       CS 5000/01 
// Term:        Fall 2015 
// Name:        Blayne K. Cohran 
// Instructor:  Dr. Haddad 
// Assignment:  1 

//Program calculates distance of two points
import java.util.Scanner;

public class Distance {
		public static void main (String[] args ) {
		//Create a Scanner
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please Enter two Points");
		
		//First point
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//Second point
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		//Finding the difference between x's squared
		double distOfX = (Math.pow((x2 - x1), 2));
		
		//Finding the difference between y's squared
		double distOfY = (Math.pow((y2 - y1), 2));
		
		//Solving for number inside of square root
		double a = distOfX + distOfY;
		
		//Display Results
		System.out.println("The Distance between the two Points is " 
		+ (Math.pow(a, 0.5)));
	}
}