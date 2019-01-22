package grades;

import java.util.HashMap;

public class GradesaApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("Genius", new Student("Albert Einstein"));
        students.get("Genius").addGrade(110);
        students.get("Genius").addGrade(900);
        students.get("Genius").addGrade(105);
        System.out.println("Average Grade: " + students.get("Genius").getGradeAverage());

        students.put("StandupMaths", new Student("Matt Parker"));
        students.get("StandupMaths").addGrade(100);
        students.get("StandupMaths").addGrade(99);
        students.get("StandupMaths").addGrade(89);
        System.out.println("Average Grade: " + students.get("StandupMaths").getGradeAverage());

        Student nikolai = new Student("Nikolai Tesla");
        nikolai.addGrade(101);
        nikolai.addGrade(99);
        nikolai.addGrade(100);
        students.put("ACnotDC", nikolai);
        System.out.println("Average Grade: " + students.get("ACnotDC").getGradeAverage());

        Student simone = new Student("Simone Giertz");
        simone.addGrade(98);
        simone.addGrade(85);
        simone.addGrade(76);
        students.put("iBuildRobots", simone);
        System.out.println("Average Grade: " + students.get("iBuildRobots").getGradeAverage());

        System.out.println();
        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");

        String usernames = "";
        for (String user : students.keySet()) {
            usernames += "|" + user + "| ";
        }
        System.out.println(usernames);
        System.out.println();

        String input;
        do {
            System.out.println("What student would you like to see more information on?");
            if (students.containsKey(input)){
                System.out.println("Name: " + students.get(input).getName() + " - Github Username: " + input);
                System.out.println("Current Average: " + students.get(input).getGradeAverage());
                System.out.println();
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
            }

        } while(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));

    }
}
