package day09_practice_task;
public class GroceryItems {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (String[] eachArr : items) {
            for (String eachItem : eachArr) {
                System.out.print(eachItem + "\t");
            }
            System.out.println();
        }
        System.out.print("---------------------------------");
        for (String[] eachArr : items) {
            for (int i = eachArr.length - 1; i >= 0; i--) {
                System.out.print(eachArr[i] + "\t");

            }
            System.out.println();

            System.out.println("---------------------------------");

            for(int i = items.length -1; i >= 0; i--){
                for(String eachItem : items[i]){
                }
                System.out.println();


            }
        }
    }
}