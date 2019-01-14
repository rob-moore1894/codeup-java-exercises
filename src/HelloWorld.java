import java.sql.SQLOutput;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello,");
        System.out.println("World!");

        //Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 1894;
        System.out.println(myFavoriteNumber);

        //Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString= "Hooah";
        System.out.println(myString);

        //Change your code to assign a character value to myString. What do you notice?
        //myString = 'H';
            //Causes an error java: incompatible types: char cannot be converted to java.lang.String

        //Change your code to assign the value 3.14159 to myString. What happens?
        //myString = 3.14159;
            //Causes an error java: incompatible types: double cannot be converted to java.lang.String

        //Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        //long myNumber = ;
            //Causes an error java: illegal start of expression

        //Change your code to assign the value 3.14 to myNumber. What do you notice?
        // long myNumber = 3.14;
            //Causes an error java: incompatible types: possible lossy conversion from double to long

        //Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        //long myNumber = 123L;
        //System.out.println(myNumber);
            //Prints 123 but not 'L'

        //Change your code to assign the value 123 to myNumber.
        long myNumber = 123;
        System.out.println(myNumber);

        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        //int PI = 3.14;
        //System.out.println(PI);
            //Didn't work for either long or int

        //Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        double myNewNumber = 3.14;
        System.out.println(myNewNumber);
            //Error => java: variable myNumber is already defined in method main(java.lang.String[])
            //Error => java: incompatible types: possible lossy conversion from double to float
            //Change the variable name
            //Change the data type to double

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        System.out.println(++x);
//        System.out.println(x);

        //Try to create a variable named class. What happens?
        //String class = "CodeUp";
            //Won't work

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

        //int three = (int) "three";
            // Error: java: incompatible types: java.lang.String cannot be converted to int

//        int z = 4;
//        z += 5;
//        System.out.println(z);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        byte r = 127;
        r++;
        System.out.println(r);

        int q = 5 * 4 % 3;
        System.out.println("Q = " + q);
    }
}
