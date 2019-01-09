import  java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println();
        System.out.println("Bob is a lackadaisical teenager. In conversation, his responses are very limited. Go ahead and talk to him.");
        System.out.println();

        String userAnswer;
        String userMessage;
        do {
            System.out.println("What would you like to say: ");
            userMessage = scan.next();
            bobResponse(userMessage);

            System.out.println("Do you want to say something else to him? [Y/N]");
            userAnswer = scan.next();

        } while (userAnswer.equalsIgnoreCase("y"));
    } // end of main



    private static void bobResponse(String userMessage) {
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
            if (userMessage.endsWith("?")) {
                System.out.println("Bob says: \"Sure.\"");
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
            } else if (userMessage.endsWith("!")){
                System.out.println("Bob says: \"Whoa, chill out!\"");
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
            } else if (userMessage.equals("")){
                System.out.println("Bob says: \"Fine. Be that way!\"");
//        He answers 'Whatever.' to anything else.
            } else {
                System.out.println("Bob says: \"Whatever.\"");
            }

    }
}
