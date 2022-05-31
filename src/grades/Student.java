package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        // Stackoverflow: https://stackoverflow.com/questions/22736092/declaring-arraylist-in-java-constructor
        // ... declare it as a field, and then initialize it in the constructor.
        // private ArrayList<String> name;
        // And then in the constructor:
        // name = new ArrayList<String>();
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
    if (grades == null || grades.isEmpty()){
        return 0;
    }
    double sum = 0;
    for (Integer grade : grades){
        sum += grade;
    }
    return sum / grades.size();
    }
    // Need to implement a method that returns grades. Need to do a getter on an arraylist
    public ArrayList<Integer> getGrades(){
        return grades;
        // Searched for "java getter on ArrayList"
        // Result: https://stackoverflow.com/questions/33060592/getters-and-setters-for-arraylists-in-java
        // Summary
        // 1. declare an arraylist
        // 2. create a getter that uses ArrayList as a type that returns the declared variable
        // 3. have caller (ex: psvm) call the getter (ex: getStringList()) and then mutate the ArrayList:
        // Example
        // 1. Declare
        //  Private ArrayList<String> stringList;
        // 2. Create getter
        //  public ArrayList<String> getStringList() {
        //    return stringList;
        //  }
        //  3. Refer to the main method
    }
}





