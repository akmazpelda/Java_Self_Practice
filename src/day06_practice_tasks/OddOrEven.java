package day06_practice_tasks;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(isOdd(100));

        System.out.println(isEven(100));
    }

    public static boolean isOdd(int n){
        return n % 2 == 1;

    }
    public static boolean isEven(int n){
        return n % 2 == 0;

    }
}
