package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName = input.nextLine();

        System.out.println("Enter the price of" + productName);
        double price = input.nextDouble();

        System.out.println("Enter the quantity " + productName);
        int quantity = input.nextInt();

        System.out.println("Enter your first name");
        String firstName = input.next();

        input.close();

        System.out.println(firstName + ", your order for " + quantity + " " + productName + " has been played. Your total is $" + (quantity * price));


    }
}
