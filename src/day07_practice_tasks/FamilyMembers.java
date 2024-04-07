package day07_practice_tasks;

import  java.util.Scanner;
public class FamilyMembers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people = input.nextInt();
        input.close();

        String result;
        if (people < 3 ) {
            result = "Live with less than 3 people";
        } else if (people < 6) {
            result = "Live with 3-6 people";
        }else {
            result = "Live with more than six people";
        }
        System.out.println(result);

        }
    }

