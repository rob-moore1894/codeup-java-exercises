import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {

        //    Game Development 101
//
//    Welcome to the world of game development!
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number
        guess(userInput(1,100), randomNumber());
//    All user inputs are validated
//    If user's guess is less than the number, it outputs "HIGHER"
//    If user's guess is more than the number, it outputs "LOWER"
//    If a user guesses the number, the game should declare "GOOD GUESS!"


    } // End of main()

    public static int randomNumber(){
        int computerChoice = (int) Math.floor(Math.random() * 100 + 1);
        return computerChoice;
    } // End of randomNumber()

    public static int userInput(int min, int max){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int number;
        System.out.println("Enter a number within 1 and 100: ");
        number = scanner.nextInt();
        if (number >= min && number <= max){
            return number;
        } else {
            System.out.println("\"" + number + "\" is not within range. Please try again.");
            return userInput(min, max);
        }
    } // End of userInput()

    public static void guess(int userInput, int computerChoice){
        if (userInput == computerChoice){
            System.out.println("GOOD GUESS");
            System.out.println("Your guess = " + userInput);
            System.out.println("Computer Number = " + computerChoice);
        } else if (userInput < computerChoice){
            System.out.println("HIGHER");
            System.out.println("Try again..");
            guess(userInput(1, 100), computerChoice);
        } else if (userInput > computerChoice){
            System.out.println("LOWER");
            System.out.println("Try again..");
            guess(userInput(1, 100), computerChoice);
        }
    } // End of guess()
} // End of class
