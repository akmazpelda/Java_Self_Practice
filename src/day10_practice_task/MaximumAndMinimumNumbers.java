package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAndMinimumNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int min = nums.get(0);
        int max = nums.get(0);

        for (int each : nums){
            if(each > max){
                max = each;
            }
         if (each < min){
             min = each;

         }

        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minumum number is " + min);
    }
}
