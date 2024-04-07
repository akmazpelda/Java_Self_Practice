package day08_practice_tasks;

import java.util.Scanner;

public class EmailTaski {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        int underscore = email.indexOf('_');

        if (underscore > 0) {
            int at = email.indexOf('@');

            String firstname = email.substring(0, underscore);
            String lastname = email.substring(underscore + 1, at);

            System.out.println(lastname +"_" + firstname + email.substring(at));

        } else {
            System.out.println(email);
        }

    }


    }



/*
reate a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com

 */



