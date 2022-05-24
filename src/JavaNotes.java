public class JavaNotes {
    public static void main(String[] args) {
        //declare and initialize a string array
        String[] numArray = {"one","two", "three", "four", "five"};
        System.out.println("String Array elements displayed using for loop:");
        // for loop to iterate over the string array
        for(int i=0; i<numArray.length;i++)
            System.out.print(numArray[i] + " ");

        System.out.println("\n new line");

        System.out.println("String Array elements displayed using enhanced for loop:");
        //enhanced for loop to iterate over the string array
        for(String val:numArray)
            System.out.print(val + " ");

        //declare and initialize a string array
        long[] stocks = {10L, 20L, 30L, 40L, 50L, 600L, 70L};
        for(int i=0; i<stocks.length;i++)
            System.out.print(stocks[i] + " ");

        // Let's create a method that returns the sum of all integers in an int array (nums)


    }
}
