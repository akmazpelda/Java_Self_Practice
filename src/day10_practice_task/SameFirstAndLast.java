package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {


    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Anna","Canada","Bob", "David","Lan","Abida", "Ebrahim", "Farida"));

 words.removeIf(p-> p.substring(0,1).equalsIgnoreCase(p.substring(p.length() - 1)));
        System.out.println(words);
    }
}
