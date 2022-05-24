
// Java Program to find sum of elements in a given array
class Test {
    // Initialize an array arr and a variable sum.
    // public static int arr[] = { 12, 3, 4, 15 };

    // method for sum of elements in an array
    public static int sum(){
    // Initialize an array arr and a variable sum.
        int arr[] = { 12, 3, 4, 15 };
    // Create variable to hold the array elements set to 0
        int sum = 0;
    // Declare the iterating variable
        int i;
        // Iterate through all elements
        for (i = 0; i < arr.length; i++)
        // Add them to sum at i. In every iteration, perform sum = sum + arr[i].
            sum += arr[i];
        return sum;
    }

    // Execute method(s)
    public static void main(String[] args){
   // After the termination of the loop, print the value of the sum.
      System.out.println("Sum of given array is " + sum());
    }
}