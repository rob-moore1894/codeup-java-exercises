import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        int a = 5;
        int b = 2;
        System.out.println(add(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        System.out.println(modulus(a, b));
        System.out.println(multiplyAgain(a,  b));


        System.out.println(factorial(getInteger(1, 10)));

        rollDice();

        System.out.println();
        System.out.println("Enter something: ");
        String input = scan.next();
        System.out.println("First character is: " + firstChar(input));
        System.out.println("Second character is: "+ secondChar(input));
        System.out.println("Second to last character is: " + secondToLastChar(input));
        System.out.println("Last character is: " + lastChar(input));
        System.out.println("Does \"" + input + "\" have vowels? " + hasVowels(input));
        System.out.println("\"" + input + "\" has " + countVowels(input) + " vowels");

        System.out.println(userWantsToContinue());

        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        System.out.println("Is " + number + " even? " + isEven(number));
        System.out.println("Is " + number + " odd? " + isOdd(number));

        System.out.println("Enter a second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("The number of odd numbers between " + number + " and " + secondNumber + " is: " + countOdds(number, secondNumber));
        System.out.println("The number of even numbers between " + number + " and " + secondNumber + " is: " + countEvens(number, secondNumber));

        System.out.println("Enter a letter: ");
        String letter = scan.next();
        System.out.println("Is \"" + letter + "\" a vowel? " + isVowel(letter));


    }// End of main()

    public static int add(int a, int b){
        return a + b;
    } // End of add()

    public static int subtract(int a, int b){
        return a - b;
    } // End of subtract()

    public static int multiply(int a, int b){
        return a * b;
    } // End of multiply()

    public static int divide(int a, int b){
        return a / b;
    } // End of divide()

    public static int modulus(int a, int b){
        return a % b;
    } // End of modulus()

    public static int multiplyAgain(int a, int b){
        if (b == 0) {
            return 0;
        } else if (b == 1) {
            return a;
        } return a + multiplyAgain(a, b-1);
    } // End of multiplyAgain()

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int number;
        System.out.println("Enter a number within 1 and 10: ");
        number = scanner.nextInt();
        if (number >= min && number <= max){
            return number;
        } else {
            System.out.println("\"" + number + "\" is not within range. Please try again.");
            return getInteger(min, max);
        }
    } // End of getInteger()

    public static long factorial(int num){
        System.out.print(num + "! = 1");
        int result = 1;
        for (int i=2; i<=num; i++) {
            result *= i;
            System.out.print(" x " + i);
        }
        System.out.println(" = " + result);
            return result;
    } // End of factorial

//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.

    public static void rollDice(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String response;
        do {
            System.out.println();
            System.out.println("***** We are going to roll a pair of dice *****");
            System.out.println("Enter the number of sides per die: ");
            int diceSides = sc.nextInt();
            int firstDie = (int) Math.floor(Math.random() * diceSides + 1);
            int  secondDie = (int) Math.floor(Math.random() * diceSides + 1);
            System.out.println("Rolled dice = [" + firstDie + "] [" + secondDie + "]");

            System.out.println("Would you like to roll again? [Y/N]");
            response = sc.next();

        } while (response.equalsIgnoreCase("y"));
    } // End of rollDice()

//    Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.

    public static char firstChar(String input){
        return input.charAt(0);
    } // End of firstChar()
//    Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.

    public static char secondChar(String input){
        return input.charAt(1);
    } // End of secondChar()
//    Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.

    public static char lastChar(String input){
        return input.charAt(input.length()-1);
    } // End of lastChar()
//    Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.

    public static char secondToLastChar(String input){
        return input.charAt(input.length()-2);
    } // End of secondToLastChar()
//
//    Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".

    public static boolean userWantsToContinue(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Would you like to continue? [Y/N]");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            return true;
        } return false;
    } // End of userWantsToContinue()
//
//    Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
    public static boolean isEven(int input){
        if (input % 2 == 0){
            return true;
        } return false;
    } // End of isEven()
//
//    Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
    public static boolean isOdd(int input){
        if (input % 2 != 0){
            return true;
        } return false;
    } // End of isOdd()
//
//    Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
    public static int countOdds(int start, int end){
        int oddNumbers = 0;
        for(int i = start;i <= end;i++){
            if(i %2 == 1){
                oddNumbers++;
            }
        }
        return oddNumbers;
    } // End of countOdds()
//
//    Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.

    public static int countEvens(int start, int end) {
        int evenNumbers = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    } // End of countEvens()
//
//    Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".

    public static boolean isVowel(String letter){
        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i")|| letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")){
            return true;
        } return false;
    } // End of isVowel()

    public static boolean isVowel(char letter){
        if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U'){
            return true;
        } return false;
    }
//    Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.

    public static boolean hasVowels(String input){
        for (int i = 0; i < input.length(); i++){
            if (isVowel(input.charAt(i))){
                return true;
            }
        } return false;
    }// End of hasVowels()

//    Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.

    public static int countVowels(String input){
        int vowels = 0;
        for (int i = 0; i < input.length(); i++){
            if (isVowel(input.charAt(i))){
                vowels++;
            }
        } return vowels;
    } // End countVowels()
//    Write a solution to FizzBuzz using recursion instead of a loop.
//
//    Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.


//    Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.
} // End of class
