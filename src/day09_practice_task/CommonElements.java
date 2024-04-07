package day09_practice_task;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int outerVal : arr1){
            for (int innerVal : arr2) {
                if (outerVal == innerVal) {
                    System.out.println(outerVal);
                }
            }

        }
    }
}
