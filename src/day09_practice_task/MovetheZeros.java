package day09_practice_task;

import java.util.Arrays;

public class MovetheZeros {

    public static void main(String[] args) {

        int[] nums = {10,0,5,0,1,0};
        int[] moved = new int[nums.length]; // [10,5,1,0,0,0]

        // i is to read from nums , y is to store to moved
        for(int i = 0, y = 0; i < nums.length; i++){
            if (nums[i] !=0){
                moved[y++] = nums[i];

            }
        }

        System.out.println(Arrays.toString(moved));
    }
}
