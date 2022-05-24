import java.util.Arrays;
//Create a class inside of src named ArraysExercises.
public class ArrayExercises {
//Create a main method for this class to do your work.
    public static void main(String[] args) {
//    What happens when you run the following code?
//        int[] numbers = {1, 2, 3, 4, 5};
//    System.out.println(numbers);
        // It printed a memory location.

        // add Arrays.toString
        // System.out.println(Arrays.toString(numbers));

// Why is Arrays.toString necessary? Answer: It Returns a string representation of the array.
// Answer continued: adding Arrays.toString gives us [1, 2, 3, 4, 5]

// Person exercise main section here
// create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        // create an array that holds 3 Person objects.
        Person arrPersonObjs[] = new Person[3];
        // Assign a new instance of the Person class to each element.
        arrPersonObjs[0] = new Person("Codey the duck");
        arrPersonObjs[1] = new Person("Thundercat");
        arrPersonObjs[2] = new Person("Kermit the Frog");
        System.out.println(Arrays.toString(arrPersonObjs));
        // Iterate through the array and print out the name of each person in the array.
        for(Person personObj : arrPersonObjs)
            System.out.println(personObj.getName());

// Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


//
        }




    }



