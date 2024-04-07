package day07_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item pen = new Item();
        pen.name = "Pen";
        pen.unitPrice = 1.49;
        pen.quantity = 8;
        System.out.println(pen);

        Item notebook = new Item();
        notebook.name = "Notebook";
        notebook.unitPrice = 3.45;
        notebook.quantity = 7;
        System.out.println(notebook);

        System.out.println(notebook.calcCost());

    }
}
