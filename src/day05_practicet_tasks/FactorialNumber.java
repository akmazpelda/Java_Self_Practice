package day05_practicet_tasks;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 5;
        int factorial = 1;

        while(num > 1){
            System.out.print(num + " * ");
            factorial *= num--; // factorial = factorial * num
        }

        System.out.println();
        System.out.println(factorial);


    }
}
