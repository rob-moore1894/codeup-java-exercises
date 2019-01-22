package util;
import java.util.Scanner;

public class Input {
    Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public String Input() {
        String userInput = getString();
        return userInput;
    }

    public String getString() {
        return scanner.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        String input = getString();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        System.out.println("Please enter a number within the min and max parameters");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("The number must be between" + min + " and " + max);
            return getInt(min, max);
        }
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("The double must be between " + min + " and " + max);
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }
}
