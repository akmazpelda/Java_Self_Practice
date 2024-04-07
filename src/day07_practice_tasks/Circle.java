package day07_practice_tasks;

import day05_practicet_tasks.SumOfNumbers;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = input.nextDouble();
        input.close();

        double area = radius * radius *3.14;
        double perimeter = 2 * radius * 3.14;

        System.out.println("the radius" + radius);
        System.out.println("the area of the circle is + area");
        System.out.println("The perimeter of the circle is " + perimeter);






    }
}
