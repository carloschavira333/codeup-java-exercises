import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//  Create a class named Bob with a main method for the following exercise.
//
//  Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//  Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//  He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//  He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//  He answers 'Whatever.' to anything else.
//  Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Talk to Bob");
    String input = scanner.nextLine();

    boolean question = input.endsWith("?"); // Returns true if question has a "?"
//    System.out.println(question);
    boolean exclamation = input.endsWith("!"); // Returns true if "!"
//    System.out.println(exclamation);
    boolean empty = input.isEmpty(); // Returns true if " "
//    System.out.println(empty);

    if (question) {System.out.println("Sure.");}
    else if (exclamation) {System.out.println("Whoa, chill out!");}
    else if (empty) {System.out.println("Fine. Be that way!");}
    else {System.out.println("Whatever.");}

    }
}
