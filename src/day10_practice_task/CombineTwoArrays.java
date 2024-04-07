package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {
        String[] arr1 = {"A", "B" , "C"};
        String[] arr2 = {"D", "E" , "F" , "G"}; // i + 5 - 3 = 2
        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(Arrays.asList(arr1));
        combined.addAll(Arrays.asList(arr2));

        System.out.println(combined);
        // option 2
        ArrayList<String> combined2 = new ArrayList<>();
        int totalLen = arr1.length + arr2.length;
        for (int i  = 0; i < totalLen; i++) {
            if(i<arr1.length) {
                combined2.add(arr1[i]);
            }else {
                combined2.add(arr2[i - arr1.length]);

            }


        }



    }

}
