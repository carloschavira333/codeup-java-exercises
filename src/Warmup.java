public class Warmup {
    public static void main(String[] args) {
        System.out.println(countWords("abc"));// returns 3
        System.out.println(reverse("Today")); //yadseut si yadoT
        System.out.println(checkEnding("abc123","123"));
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

}
