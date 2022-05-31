package grades;

//Create a map for students and GitHub usernames

//  Create a class named GradesApplication with a main method.

//  Inside the main method, create a HashMap named students.
//      It should have keys that are strings that represent github usernames,
//      and values that are Student objects.
//
//      Create at least 4 Student objects
//      with at least 3 grades each,
//      and add them to the map.

//  Be creative! Make up GitHub usernames and grades for your student objects.

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        //  Inside the main method, create a HashMap named students.
        //  HashMap<String, String> usernames = new HashMap<>();
        //  usernames.put("Ryan", "ryanorsinger");

        //  Create at least 4 Student objects
        //  with at least 3 grades each,
        HashMap<String, Student> students = new HashMap<>();

        Student codey = new Student("Codey");
        codey.addGrade(100);
        codey.addGrade(95);
        codey.addGrade(70);

        Student duckey = new Student("Duckey");
        duckey.addGrade(88);
        duckey.addGrade(95);
        duckey.addGrade(70);

        Student jim = new Student("Jim");
        jim.addGrade(88);
        jim.addGrade(75);
        jim.addGrade(50);

        Student michael = new Student("Michael");
        michael.addGrade(88);
        michael.addGrade(85);
        michael.addGrade(80);

        //  and add them to the map.
        students.put("codester", codey);
        students.put("daffyDo", duckey);
        students.put("heyDwight", jim);
        students.put("didJaniceLeave", michael);

        Scanner input = new Scanner( System.in);
        String answer = null;
        do{
            //Here are the GitHub usernames of our students:
            System.out.println("Here are the GitHub usernames of our students: ");
            //|zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|
            students.entrySet().forEach( entry -> {
                System.out.printf("|" + entry.getKey() + "| " );
            });
            System.out.println("\n");
            //What student would you like to see more information on?
            Scanner userChoice = new Scanner(System.in);
            System.out.println("What student would you like to see more information on? ");
            String userResponse = userChoice.next();
            System.out.println(userResponse);

            if (students.containsKey(userResponse)){
                //What student would you like to see more information on?
                //> zgulde
                //Name: Zach - GitHub Username: zgulde
                //Current Average: 87.4
                System.out.println("Name: " + students.get(userResponse).getName() + " - " + "Github user name: " + userResponse + " \nCurrent Average: " + students.get(userResponse).getGradeAverage());
            } else if (!students.containsKey(userResponse)){
                System.out.println("Sorry " + userResponse + " is not a student here.");
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
            }
            // then when done:
            System.out.println( "Would you like to see another student? " );
            answer = input.nextLine();
        } while(answer.equals("Y") || answer.equals("y") || answer.equals("yes"));
    }
}

