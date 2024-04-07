package day09_practice_task;

public class ClassMatesInitials {

    public static void main(String[] args) {

      //   2.1 Create an array of strings named classmates.
     //   2.2 Store full names of 10 classmates.
     String[] classmates = {"James bond", "Anna Frank", "Mona F","George D", "Mary K", "Nick M","Kate L", "Bruce W", "Clark K", "Eda F"};


     //  2.3 Print the initials of each student's name in separate lines.
     for(String eacName : classmates) { // for (int i = 0; i < classmates.length; i++) {
         System.out.println(eacName.charAt(0) + " " + eacName.charAt (eacName.indexOf(' ') + 1));

         }

         // for loop -> classmates[i]
        //   for each -> eachName




    }
}






/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
 2.1 Create an array of strings named classmates.
 2.2 Store full names of 10 classmates.
 2.3 Print the initials of each student's name in separate lines.
 */





