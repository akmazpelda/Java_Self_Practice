package day05_practicet_tasks;

public class Alphabets {

    public static void main(String[] args) {

        for(char outer = 'A'; outer <= 'E'; outer++){
            for(char inner = 'a'; inner <= 'z'; inner++){
                System.out.print(outer + " " + inner + " ");
            }
            System.out.println();
        }
    }
}
