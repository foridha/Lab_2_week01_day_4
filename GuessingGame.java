/* Step 1. Import classes from java.util */
import java.util.Random; // telling Java program to import the random class to generate random numbers
import java.util.Scanner; // import the Scanner class to take user input

/* Step 2. Define a class called GuessingGame */
public class GuessingGame { // class acts as a blueprint
    public static void main(String[] args) { // the main method - this is the entry point of the program

        /* Step 3. Create a Random object */
        Random random = new Random(); // creates an object based on the Random class (blueprint) with the variable name 'random'
        int secretNumber = random.nextInt(11); // Tells the random object to generate a number with the *exclusive* upperbound (101) and store it as variable 'secretNumber'

        /* Step 4. Create a Scanner object */
        Scanner scanner = new Scanner(System.in); // creates an object based on the Scanner class (blueprint) with the variable name 'scanner' and reads from keyboard ('System.in')

        /* Step 5. Prompt a user to input a number */
        System.out.println("Guess the random number between 1 and 10");
        int guess = scanner.nextInt(); // reads the users input as a number and stores it as guess variable

        /* Step 6. Print options as follows */
        if (guess < secretNumber){
                System.out.println("Too low :( It was " + secretNumber); // You need a space before "
        } else if (guess > secretNumber) {
                System.out.println("Too high :( It was " + secretNumber);
        } else {
            System.out.println("Congratulations! You guessed the correct number :)");
        }
    }
}