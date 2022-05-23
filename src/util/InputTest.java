package util;

public class InputTest {

    public static void main(String[] args) {
        Input s2 = new Input();
        System.out.println(s2.getString());
        System.out.println(s2.yesNo());
        System.out.println(s2.getInt(1, 10));
        System.out.println(s2.getInt());
//        System.out.println(s2.getDouble(1, 10));
        System.out.println(s2.getDouble());
    }

}
