package day06_practice_tasks;

public class MathUtility {
    public static void main(String[] args) {
        System.out.println(calculate(2.5, '*', 3.0));
        System.out.println(calculate(10, '+', 20));
        System.out.println(square(8));
        System.out.println(square(1.5));
        System.out.println(cube(3));
        System.out.println(cube(2.5));
    }

    public static int calculate(int n1, char operator, int n2) {
        return (int) (calculate((double) n1, operator, n2));
    }

    public static double calculate(double n1, char operator, double n2) {
        return switch (operator) {
            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '*' -> n1 * n2;
            case '/' -> n1 / n2;
            case '%' -> n1 % n2;
            default -> 0;
        };
    }

    public static int square(int n) {
        return n * n;
    }

    public static double square(double n) {
        return n * n;
    }

//    public static int square(int n){
//        return calculate(n, '*', n);
//    }

    public static int cube(int n) {
        return n * n * n;
    }

    public static double cube(double n) {
        return n * n * n;
    }
}
