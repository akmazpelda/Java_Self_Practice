package day08_practice_tasks;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word= input.next ();
        input.close();

        if(word.charAt(0) == 'x'){
            word = "a" + word.substring(1);

            System.out.println(word);

        }



    }

}


    /*

 1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.
Example:
Input:
xcodex

Output:
acodex

 */



