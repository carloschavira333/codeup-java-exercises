package grades;

public class StudentTest {
    public static void main(String[] args) {
        //Test your Student class by creating a StudentTest class, adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
            Student newStudent1 = new Student("Codey");
            newStudent1.addGrade(100);
            newStudent1.addGrade(95);
            newStudent1.addGrade(95);
            newStudent1.addGrade(95);
            newStudent1.addGrade(70);
            System.out.println("Student Name: " + newStudent1.getName());
            System.out.println("Student Grades: " + newStudent1.getGrades());
            System.out.println("Student Grade Average: " + newStudent1.getGradeAverage());

            Student newStudent2 = new Student("Duckey");
            newStudent2.addGrade(88);
            newStudent2.addGrade(90);
            newStudent2.addGrade(95);
            newStudent2.addGrade(95);
            newStudent2.addGrade(70);
            System.out.println("Student Name: " + newStudent2.getName());
            System.out.println("Student Grades: " + newStudent2.getGrades());
            System.out.println("Student Grade Average: " + newStudent2.getGradeAverage());
        }
    }
