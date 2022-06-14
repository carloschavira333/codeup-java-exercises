public class Warmup {
    public static void main(String[] args) {
        System.out.println(countWords("abc"));// returns 3
        System.out.println(reverse("Today")); //yadseut si yadoT
    }

    public static int countWords(String s){
        String[] words = s.split("");
        return words.length;
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }


}
