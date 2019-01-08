import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f \n", pi);
        //The value of pi is approximately 3.14.

        System.out.print("Enter an Integer: ");
        int userInput = scanner.nextInt();

        System.out.println(userInput);

        System.out.println("Enter three words: ");
        String userFirstWord = scanner.next();
        String userSecondWord = scanner.next();
        String userThirdWord = scanner.next();

        System.out.println(userFirstWord);
        System.out.println(userSecondWord);
        System.out.println(userThirdWord);

        System.out.println("Type a sentence: ");
        String userSentence = scanner.next();
        System.out.println(userSentence); //Prints only the first word with String userSentence = scanner.next();

        System.out.println("What is the length of the room: ");
        double length = Double.parseDouble(scanner.next());
        System.out.println("Great! Now enter the width of the room: ");
        double width = Double.parseDouble(scanner.next());
        System.out.println("Fantastic! What is the height of the room: ");
        double height = Double.parseDouble(scanner.next());

        double area = length * width;
        double perimeter = 2*length + 2*width;
        double volume = length * width * height;

        System.out.print("Length: " + length + "\nWidth: " + width + "\nHeight: " + height + "\nArea: " + area + "\nPerimeter: " + perimeter + "\nVolume: " + volume);


    }
}