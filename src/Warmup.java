import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {
        System.out.println(countWords("abc"));// returns 3
        System.out.println(reverse("Today")); // yadseut si yadoT
        System.out.println(checkEnding("abc123","123"));// true
        System.out.println(triangle(2)); // 3
        System.out.println(calculator(10, '/', 2));
        System.out.println(hasVowel("cat")); // true

    }

    public static int countWords(String s){
        String[] words = s.split("");
        return words.length;
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean checkEnding(String str1, String str2){
        String substr = str1.substring(str1.length()-str2.length());
        return substr.equals(str2);
    }

    // Write a function that returns the number of dots when given its corresponding triangle number sequence

    public static int triangle(int n){
        if (n==1) return 1;
        return (n + triangle(n - 1));
    }

    // Create a function that takes two numbers and a mathematical operator and performs a calculation with the two numbers

    public static int calculator(int m, char o, int n){
        if (o=='/' && n==0) return 0;
        // booleanExpression ? expression1 : expressioni 2
        return
                o=='+' ? m+n : o=='-' ? m-n : o=='*'? m*n: m/n;
    }

    public static boolean hasVowel(String input) {

        return input.toLowerCase().matches(".*[aeiou].*");

    }


}
