package day09_practice_task;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7,8};
        int odd = 0;
        int even = 0;
        for(int eachNum : nums){
            if (eachNum % 2 == 0){
                even++;
            } else {
                odd++;

            }
        }
        System.out.println("The array has" + odd + "odd numbers and" + even + "even numbers" );

    }
}
