package grades;

import java.util.ArrayList;

public class Student {
    //these are the private properties
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();



    public Student(){}
    //this string overrides the current constructor.
    public Student(String name){
        this.name = name;
//        this.grades = grades;
    }
    // getter for array list aka collection
    public ArrayList<Integer> getGrades() {return grades;}

    // getter for the String name
    public String getName() {return name;}

    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // to get the grade avg we are making a for loop to loop through the arrayList and we
    public double getGradeAverage(){
        double gradeTotal = 0;
        for (int i = 0; i < grades.size(); i++) {
            gradeTotal += this.grades.get(i);
        }
        return gradeTotal / this.grades.size();
    }




}
