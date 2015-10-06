// Class:       CS 5000/01 
// Term:        Fall 2015 
// Name:        Blayne K. Cohran 
// Instructor:  Dr. Haddad 
// Assignment:  1 

//Program calculates cost of driving
import java.util.Scanner;

public class DrivingCost {
	public static void main (String[] args ) {
		//Create a Scanner
		Scanner input = new Scanner(System.in); 
		
		//Get User Inputs
		System.out.print("Enter the Driving Distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter Miles per Gallon: ");
		double mpg = input.nextDouble();
		System.out.print("Enter Price per Gallon: ");
		double gasPrice = input.nextDouble();
		
		//calculate Cost to Drive
		double cost = ((distance / mpg) * gasPrice);
		
		//Display Results
		System.out.println("The Cost of Driving is $" + 
		(int)(cost*100)/100.0);
	}
}