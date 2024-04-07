package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5,9,9,10));
        nums.removeIf(p-> Collections.frequency(nums,p) > 1);

        System.out.println(nums);





    }
}
