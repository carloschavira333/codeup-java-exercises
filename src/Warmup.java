public class Warmup {
    public static void main(String[] args) {
        fizzBuzz(1);

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
