public class Warmup {
    public static void main(String[] args) {
//        fizzBuzz(1);
        System.out.println(countWords("abc"));// returns 3
    }

    public static int countWords(String s){
        String[] words = s.split("");
        return words.length;
    }

    public static int fizzBuzz(int input){
        String fizz = "fizz";
        String buzz = "buzz";
        String fizzbuzz = "fizzbuzz";

        for (int i = 0; i <= 100; i++){
            if (input % 3 == 0){
                System.out.println(fizz);
            } else if (input % 5 == 0 ){
                System.out.println(buzz);
            } else {
                System.out.println(fizzbuzz);
            }
        }
        return 0;
    }
}
