package day06_practice_tasks;

public class MaximumAndMinimum {

        public static void main(String[] args) {

            System.out.println(max(10.5, 30.2));

            System.out.println(min(100, 200));
        }

        public static int max(int n1, int n2){
            return n1 > n2 ? n1 : n2;
        }

        public static double max(double n1, double n2){
            return n1 > n2 ? n1 : n2;
        }

        public static int min(int n1, int n2){
            if(n1 < n2){
                return n1;
            } else {
                return n2;
            }
        }

        public static double min(double n1, double n2){
            if(n1 < n2){
                return n1;
            } else {
                return n2;
            }
        }

}