package day07_practice_tasks;


import java.util.Scanner;

    public class MyInfo {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your age");
            int age = input.nextInt();

            System.out.println("Enter your gender");
            String gender = input.next();

            input.nextLine(); // empty enter input

            System.out.println("Enter your full name");
            String fullName = input.nextLine();

            System.out.println("Enter your phone number");
            long phoneNumber = input.nextLong();

            System.out.println("Enter your zipcode");
            int zipcode = input.nextInt();

            input.nextLine(); // empty enter input

            System.out.println("Enter your school name");
            String schoolName = input.nextLine();

            System.out.println("Enter your city name");
            String city = input.nextLine();

            System.out.println("Enter your state name");
            String state = input.next();

            System.out.println("Enter your building number ");
            int buildingNumber = input.nextInt();

            System.out.println("Enter your street name");
            input.nextLine();
            String streetName = input.nextLine();

            input.close();

            String result = fullName + "\n" + age + "\n" + gender + "\n" + phoneNumber + "\nAddress\n\t" + buildingNumber + " " + streetName + "\n\t" + city + ", " + state + " " + zipcode;

            System.out.println(result);
        }

    }
