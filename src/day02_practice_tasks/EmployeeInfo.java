package day02_practice_tasks;


/*
employeeName (String)
age (int)
gender (char)
companyName (String)
jobTitle (String)
yearsOfExperience (double)
salary (int)
isFullTime (boolean)
isMarried (boolean)
employeeId (String)

Display the full employee information in the following format.

        Example:
employeeName = "Shay";
age = 24;
gender = 'F';
companyName = "Apple Inc";
jobTitle = "SDET";
yearsOfExperience = 2.5;
salary = 120_000;
isFullTime = true;
isMarried = false;
employeeId = "B101";

Output:
Employee name: Shay
Gender: F
Age: 24
Employee ID: B101
Job title: SDET
Company name: Apple Inc
Full time: true
Years of work experience: 2.5 years
Salary: $120000.0
Married: false

 */

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName = ("Shay");
        int age = 24;
        char  gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println( "employee name: " + employeeName +
                "\n" + "gender : " + gender +
                "\n"+ "age : "+ age +
                "\n" + "employee id:" +employeeId +
                "\n" + "Job tittle: " + jobTitle +
                "\n" + "company name: " + companyName +
                "\n" + "full time : " +isFullTime +
                "\n" + " years of experience: " + yearsOfExperience +
                "\n" + "salary:" + salary +
                "\n" + "married: " + isMarried);



    }

}
