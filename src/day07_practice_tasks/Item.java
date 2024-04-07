package day07_practice_tasks;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public double calcCost(){
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ",total price=" +calcCost() +
                '}';
    }
}
