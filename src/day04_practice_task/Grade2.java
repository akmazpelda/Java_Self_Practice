package day04_practice_task;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'B';
        String result;

        switch (grade){
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid Grade";
        }

        System.out.println(result);



    }
}



