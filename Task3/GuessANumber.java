import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	    System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        // Create a Scanner object   
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your guess: ");	 
        // use hasNextDouble to check if input is numeric, 
        if (scanner.hasNextDouble()){
        // if so...
	// Read user input
        double guess = scanner.nextDouble();
        // Compare it with the random number
        if (guess > rnd_number){

            System.out.println("You guessed too high dummy... try again");
             // Let the user know the result of the comparison
            makeAGuess();
        }else if (guess < rnd_number){
            System.out.println("You guessed too low dummy... try again");
       // Let the user try again by calling this method recursively
            makeAGuess();
        }else if(guess == rnd_number){

        System.out.println("YOU ACTUALLY DID IT, whoa, you're good at this I guess");    
           }
        }else{
        // if input was not numeric show an error message and call this method recursively
         System.out.println("You've got to guess a number... didn't I make that clear?");   

         scanner.next();

         makeAGuess();
        } 
    }
}
