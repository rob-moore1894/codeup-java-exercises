package grades;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.studentName;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        if (grades.size() == 0) {
            return 0;
        }
        int total = 0;
        for (int i = 0; i < grades.size(); i++ ){
            total += grades.get(i);
        }
        return total / grades.size();
    }

    public static void main(String[] args) {
        Student rob = new Student("Rob");
        rob.addGrade(100);
        rob.addGrade(90);
        rob.addGrade(95);

        System.out.println("Average grade for " + rob.studentName + " is: " + rob.getGradeAverage());

    }

}
