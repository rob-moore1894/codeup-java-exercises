import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

//        ***** While Loop *****
//        Create an integer variable i with a value of 5.
        int i = 5;

//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15

        while (i <= 15){
            System.out.print(" " + i++ );
        }
        System.out.println();

//        ***** Do While Loop *****
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int num = 0;
        do {
            System.out.println(num+=2);
        } while (num < 100);
//        Alter your loop to count backwards by 5's from 100 to -10.
        System.out.println();

        int newNum = 105;
        do {
            System.out.println(newNum-=5);
        } while (newNum > -10);
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        Output should equal:
//        2
//        4
//        16
//        256
//        65536

        System.out.println();
        long k = 2;
        do {
            System.out.println(k);
            k *= k;
        } while(k < 1000000);

//        ***** For Loop *****
//        refactor the previous two exercises to use a for loop instead

        System.out.println();
        for (int x = 5; x <= 15; x++){
            System.out.print(" " + x);
        }

        System.out.println();
        for (int a = 0; a < 100; a+=2){
            System.out.println(a);
        }

        System.out.println();
        for (int b = 100; b >= -10; b-=5){
            System.out.println(b);
        }

        System.out.println();
        for (long c = 2; c < 1000000; c++){
            System.out.println(c);
            c *= c;
        }

        System.out.println();
       for (int n = 1; n <= 100; n++){
            if (n % 15 == 0) {
                System.out.println(n + " FizzBuzz");
            } else if (n % 5 == 0) {
                System.out.println(n + " Buzz");
            } else if (n % 3 == 0) {
                System.out.println(n + " Fizz");
            } else {
                System.out.println(n);
            }
        }

        System.out.println();

//        ***** Display a table of powers *****
        String userAnswer;
        do {
            System.out.println("Enter an integer: ");
            int userNumber = scanner.nextInt();
            printTable(userNumber);

        System.out.println("Would you like to continue? [Y/N]");
        userAnswer = scanner.next();
        } while (userAnswer.equalsIgnoreCase("y"));

        System.out.println("Enter a numerical grade: ");
        int grade = scanner.nextInt();
        char letterGrade;
        if (grade >= 88) {
            letterGrade = 'A';
        } else if (grade >= 80) {
            letterGrade = 'B';
        } else if (grade >=67) {
            letterGrade = 'C';
        } else if (grade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("Letter Grade = " + letterGrade);

    }

    private static void printTable(int userNumber){
            //Display a table of squares and cubes from 1 to the value entered.
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number | square | cubed");
            System.out.println("------ | ------ | ------ ");
            for (int j = 1; j <= userNumber; j++) {
                int squared = j * j;
                int cubed = j * j * j;
                System.out.format("%-7s| %-7s| %-7s\n", j, squared, cubed);
            }
    }
}
