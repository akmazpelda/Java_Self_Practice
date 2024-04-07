package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {

    public static void main(String[] args) {

    ArrayList<Character> chars = new ArrayList<>(Arrays.asList('$' ,'A','B','z','Y','1','2','c','d','@','!','3','4','*' ));

        chars.removeIf(p-> Character.isLetter(p));

        System.out.println(chars);



    }
}
