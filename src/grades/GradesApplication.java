package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String,Student> students = new HashMap<>();
        Student s1 = new Student("john");
        s1.addGrade(100);
        s1.addGrade(100);
        s1.addGrade(100);
        students.put("john",s1);
//        System.out.println("s1.getName() = " + s1.getName());
//        System.out.println("s1.getGrades() = " + s1.getGrades());
//        System.out.println("s1.getGradeAverage() = " + s1.getGradeAverage());
        
        
        Student s2 = new Student("goog");
        s2.addGrade(23);
        s2.addGrade(49);
        s2.addGrade(89);
        students.put("goog",s2);
//        System.out.println("s2.getName() = " + s2.getName());
//        System.out.println("s2.getGrades() = " + s2.getGrades());
//        System.out.println("s2.getGradeAverage() = " + s2.getGradeAverage());


        Student s3 = new Student("bug");
        s3.addGrade(50);
        s3.addGrade(78);
        s3.addGrade(13);
        students.put("bug",s3);
//        System.out.println("s3.getName() = " + s3.getName());
//        System.out.println("s3.getGrades() = " + s3.getGrades());
//        System.out.println("s3.getGradeAverage() = " + s3.getGradeAverage());


        Student s4 = new Student("felix");
        s4.addGrade(13);
        s4.addGrade(1);
        s4.addGrade(23);
        students.put("felix",s4);
//        System.out.println("s4.getName() = " + s4.getName());
//        System.out.println("s4.getGrades() = " + s4.getGrades());
//        System.out.println("s4.getGradeAverage() = " + s4.getGradeAverage());
        System.out.println(students);
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:\n" +
                "\n" +
                "|john| |goog| |bug| |felix|");
        System.out.println("\nWhat student would you like to see more information on?\n If no say 'bye'");
        Scanner scanner = new Scanner(System.in);

        while(true){
            String userResponse = scanner.nextLine().trim();
            if (userResponse.toLowerCase().equals("john")){
                System.out.println("Name: John - GitHub UserName:"+ s1.getName()+ "\n Grade Avg: "+ s1.getGradeAverage());
            } else if (userResponse.toLowerCase().equals("goog")){
                System.out.println("Name: Google - GitHub UserName:"+ s2.getName()+ "\n Grade Avg: "+ s2.getGradeAverage());
            } else if (userResponse.toLowerCase().equals("bug")){
                System.out.println("Name: BugMan - GitHub UserName:"+ s3.getName()+ "\n Grade Avg: "+ s3.getGradeAverage());
            } else if (userResponse.toLowerCase().equals("felix")){
                System.out.println("Name: xqcOW - GitHub UserName:"+ s4.getName()+ "\n Grade Avg: "+ s4.getGradeAverage());
            } else if (userResponse.toLowerCase().equals("bye")) {
                System.out.println("see ya");
                break;
            } else {
                System.out.println("invalid response");
            }
        }


    }
}
