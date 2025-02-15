package day04_practice_task;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 42;
        String result;
        if (age >= 0 && age <= 150) { // valid age (0-150)
            if (age >= 0 && age <= 20) {
                result = "Teenager";
            } else if (age >= 21 && age <= 55) {
                result = "Young Middle-Aged Adult";
            } else {
                result = "Senior";
            }
            System.out.println(result);

        } else {
            System.out.println(age + "is not valid age");
        }

    }
}
/*
Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult

 */
