package day08_practice_tasks;

import java.util.Locale;

public class EmailTask2 {

    public static void main(String[] args) {


        String email = "JAMES_BOND@gmail.com";

        int underscoreIndex = email.indexOf('_');
        int atIndex=email.indexOf('@');
        int dotIndex=email.indexOf('.');

        String firstName=email.substring(0,underscoreIndex);
        String lastname = email.substring(underscoreIndex +1, atIndex);
        String domain = email.substring(atIndex +1, dotIndex);


        System.out.println("first Name:" +fixFormat(firstName));
        System.out.println("Last Name:" + fixFormat(lastname));
        System.out.println("Domain:" +domain);


    }

    public  static String  fixFormat(String str){
        str = str.toLowerCase();
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();

    }
}




/*
5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
        (uppercase first letter and remaining lowercase)

Example:
Input:
craig_federighi@apple.com

Output:
First name: Craig
Last name: Federighi
Domain: apple
*/






