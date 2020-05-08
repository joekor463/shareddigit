public class SharedDigit {
    public static void main (String[] args ){
        System.out.println ("result - " + hasSharedDigit(12, 43));
    }
    public static boolean hasSharedDigit(int number1, int number2){
        if ((number1 < 10) | (number1 > 99) | (number2 < 10) | (number2 > 99)) return false;
        int test1 = 0;
        int test2 = 0;
            test1 = number1 % 10;
        System.out.println (test1);
            test2 = number1 /10;
        System.out.println (test2);
        int test3 = 0;
        int test4 = 0;
            test3 = number2 % 10;
        System.out.println (test3);
            test4 = number2 /10;
        System.out.println (test4);
        if ((test1 == test3) | (test1 == test4) | (test2 == test3) | (test2 == test4)) return true;

    return false;
    }
}
