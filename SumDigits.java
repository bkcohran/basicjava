// Class:       CS 5000/01 
// Term:        Fall 2015 
// Name:        Blayne K. Cohran 
// Instructor:  Dr. Haddad 
// Assignment:  1 

//Program calculates the sum of the digits in an integer
import java.util.Scanner;

public class SumDigits {
	public static void main (String[] args ) {
		//Create a Scanner
		Scanner input = new Scanner(System.in); 
        
		System.out.print("Please Enter an Integer between 0 and 1000: "); 
        
		// num is the inputed number
		int num = input.nextInt();
		int sum = 0;
		
		/* remaining is the new number after the 
		decimal place is moved to the left*/
		int remaining = num;
		
		//Find the first digit and add it to sum
		sum = sum + remaining % 10;
		remaining = remaining / 10;
		
		//Find the second digit and add it to sum		
		sum = sum + remaining % 10;
		remaining = remaining / 10;
		
		//Find the third digit and add it to sum		
		sum = sum + remaining % 10;
		
		//Display Results
		System.out.println("The Sum of the Digits is " +sum);
	}
}
		
		