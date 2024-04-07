package day10_practice_task;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {
        System.out.println(upperLowerMatch("JAVA java"));
    }
    public static boolean upperLowerMatch (String str){
        int upper = 0, lower = 0;

        for(char each : str.toCharArray()){
            if(Character.isUpperCase(each)) {
                upper++;
            }else if(Character.isLowerCase(each)){
                lower++;
            }
        }
       return upper ==lower;
    }

}

