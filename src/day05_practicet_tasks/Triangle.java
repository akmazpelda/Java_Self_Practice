package day05_practicet_tasks;

public class Triangle {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.print("\t\t");
            for(int j = 0; j <= i; j++){ // this is for each star on each line
                // System.out.println(i + " " + j);
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
