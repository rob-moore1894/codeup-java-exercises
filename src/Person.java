import java.util.Scanner;

public class Person {
    private String name;

    // data type the constructor returns is an object
    // the type of object is a Person type
    public Person(String name) {
        this.name = name;
    }

    // getter (gets a value)
    public String getName() {
        return name;
    }

    // setter (sets a value)
    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        Person person1 = new Person("Rob");

        System.out.println("What is the second person's name: ");
        String name = scan.next();
        Person person2 = new Person(name);

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1 == person2);

    } // End of main()


} // End of Person Class

