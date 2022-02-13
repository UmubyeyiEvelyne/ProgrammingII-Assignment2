// A program to generate a random number 0 and 30, and asks the user to guess what the number is
package question2;

import java.util.Scanner;  // Importing the Scanner class to allow user input
import java.util.Random; // Importing the Random class to generate a random number

//Class which contains the main method of the program 
public class guessNumber {

	// Main method of the program
	public static void main(String[] args) {
		
		// Creating an instance of scanner class to allow user input		
		Scanner input = new Scanner(System.in);
		// Creating an instance of random class to use it in generating a random number
		Random randomObject = new Random();
		// initializing a variable which holds the upper limit in the range from which the random number
		// will be generated
		int upperBound = 30;
		// initializing a variable which holds the lower limit in the range from which the random number
		// will be generated
		int lowerBound = 1;
		// generating a random integer between 0 and 30, but exclusive of 0, and 30, and initializing it 
		// to a variable 
		int randomInteger= randomObject.nextInt(upperBound - lowerBound)+lowerBound;
		// Initializing a variable which will hold the number of guesses by the user
		int counter = 0;
		// Initializing a variable which will hold the number guessed by the user
		int guessedNumber = 0;
		
		// A loop which will prompt the user to enter a guess and it will break only when the user guess 
		// correctly	
		do {
		// prompting the user to guess a number
		System.out.println("Guess a number between 0 and 30, exclusive of 0 and 30: ");
		// accepting user input and initializing it to a variable		
		guessedNumber= input.nextInt();
		
		// Condition checks if the guessed number is greater than the random number	
		if (guessedNumber > randomInteger) {
			// This message will be printed if the guess is greater than the random number			
			System.out.println("Too high, try again!");
			
			// Condition checks if the guessed number is less than the random number	
		}else if (guessedNumber < randomInteger) {
			// This message will be printed if the guess is less than the random number
			System.out.println("Too low, try again!");
			
		}else {
			// This message will be printed if the guess is equal to the random number
			System.out.println("Matched!");
		}
		
		counter +=1; // This variable will increment each time the user enters a guess
		
		}while(guessedNumber != randomInteger); // This loop will run again if the user did not guess
		//correctly and stop only when the guessed number is equal to the random number 
		
		// This message tells the user the number of trials it took to guess the correct number by 
		//outputting the value held in the counter variable, it is printed when the user guess correctly		
		System.out.println("Found after " + counter + " trials.");
		
	}

}
