package day03_practice_tasks;

public class SallaryCalculator {

    public static void main(String[] args) {

        double hourlerate = 50;
        int weeklyHours  = 40;
        double stateTaxRate = 6;
        double federalTaxRate = 26;

        double salaryBeforeTax = (hourlerate * weeklyHours) * 52;
        double stateTax = salaryBeforeTax /100 * 6;
        double federalTax = salaryBeforeTax /100 * 26 ;
        double totalTax = stateTax + federalTax;
        double netIncome = salaryBeforeTax - federalTax - stateTax;

        System.out.println( "Gross pay is: " + salaryBeforeTax );
        System.out.println( "Federal tax is: " + federalTax);
        System.out.println( "State tax is : " + stateTax);
        System.out.println("Total tax is: " + totalTax);
        System.out.println("Net income is: " + netIncome);

    }
}
