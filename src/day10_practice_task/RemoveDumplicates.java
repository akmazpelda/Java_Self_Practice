package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDumplicates {

    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
    ArrayList<Integer> unique = new ArrayList<>(); //1

        for(int each : list){
            if(!unique.contains(each)){

                unique.add(each);

            }
        }

        System.out.println(unique);

    }

}
