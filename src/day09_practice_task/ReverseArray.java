package day09_practice_task;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] nums = { 1,2,3,4,5};
        int[] reversed = new int[nums.length];

        for(int i = 0, j = nums.length - 1; i < nums.length; i++ , j--){
           reversed[i]= nums[j];
        }
      // i is for index -> from the begining
     //  j is for value -> from the end

        System.out.println(Arrays.toString(reversed));

        int[] reversed2 = new int[nums.length];

        for (int i = 0; i <nums.length; i++){
           reversed2[i] = nums[nums.length -1 - i];

            System.out.println(Arrays.toString(reversed));




        }


    }
}
