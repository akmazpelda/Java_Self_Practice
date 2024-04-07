package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveZeros {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int numOfZero = Collections.frequency(list, 0);
        list.removeAll(Arrays.asList(0));


        for (int i = 0; i < numOfZero; i++) ;
        list.add(0);

        System.out.println(list);
      }




     /*
     for (int i = 0; i < numOfZero; i++) ;
     Integer zero = 0
     list.remove(zero);
     list.add(0);
     }
      */


}