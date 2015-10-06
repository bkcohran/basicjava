// Class:      CS 5000/01 
// Term:       Fall 2015 
// Name:       Blayne K. Cohran
// Instructor: Dr. Haddad 
// Assignment: 1 

//Program prints inputed name 
import java.util.Scanner; 
public class HelloWorld { 
    public static void main(String args[]) { 
        Scanner s = new Scanner(System.in); 
        System.out.print("Please enter your name: "); 
        String name = s.nextLine(); 
        System.out.println("Hello " + name + "!"); 
    } 
}      
