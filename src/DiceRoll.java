import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
	
	public static void main (String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int numSides;
		int die1;
		int die2;
		String cont = "";
		
		//System.out.println: must be inside of method
		
		while(!cont.equalsIgnoreCase("n")) {
			// as long as user doesn't say no, assume they want to continue
		
		// ask user to enter the number if sides for a pair of dice 
		System.out.println("How many sides should each die have?"); 
		numSides = scnr.nextInt(); 
		//using scnr class using "method.nextInt" to assign the userInput to numSides
		
		System.out.println(generateRandomDiceRoll(numSides));
		System.out.println(generateRandomDiceRoll(numSides));

		// Using a while loop because we want to use this block of code until 
		// the user wants to exit 
		
		//ask if user wants to continue
		System.out.println("Would you like to continue?");
		cont = scnr.next();
		
		}
		
	}
	
	    //3. Roll two n-sided dice 
	   	// Your method would need to have a parameter that specifies the number of 
		//sides on a dice and returns a random number between 1 and that number
	public static int generateRandomDiceRoll(int numSides) {
		//method: can't have inside of another method
		
		// Tell java we want it to take our number of sides variable
		// and generate one random number between one and number of sides 		
		 
		 Random rand = new Random(); 
		 int ranNumber;
		 // ranNumber initialized because it has already declared within the first method
		
		ranNumber = rand.nextInt(numSides) + 1; 
		//setting ranNumber to a value between zero and numSides - 1
		return ranNumber;	
		
	}	
}
