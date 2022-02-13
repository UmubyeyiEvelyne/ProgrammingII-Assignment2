// A program to print  a reverse of a number

package question1;

import java.util.Scanner;  // Importing the Scanner class to allow user input

//Class which contains the main method of the program 
public class reverseNumber {

	// Main method of the program
	public static void main(String[] args) {
		// Creating an instance of scanner class to allow user input		
		Scanner input = new Scanner(System.in);
		// Prompting the user to enter a whole number that will be reversed		
		System.out.println("Enter a whole number: ");
		// Assigning the number entered by the user to a variable		
		long number = input.nextLong();
		// variable holds the number entered by the user, this value will change through out the process
		// of reversing the number.	
		long holder = number;
		// Initializing the variable to hold the reversed number to zero	
		long reverse = 0;
		// Initializing the variable to hold each single digit of the number entered by the user to zero		
		long remainder = 0;
		
		// This loop will repeat until the number entered by the user equals zero
		while (holder > 0){
			// This variable will hold the remainder of when the number is divided by 10 which happens 
			// to be last digit of the number.			
			remainder = holder % 10;
			// the value in the remainder will be added to the ones position of the reversed number
			reverse = (reverse*10) + remainder;
			// the number entered by the user will be divided by ten which eliminates the last digit			
			holder /=10;
		}
		
		// Printing the number entered by the user and its reverse
		System.out.println("The reverse of " + number + " is: " + reverse);
	}

}
