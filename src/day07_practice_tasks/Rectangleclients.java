package day07_practice_tasks;

public class Rectangleclients {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 4.6;
        rectangle.length = 7.5;
        System.out.println(rectangle);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());


        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 15;
        rectangle2.length = 25.2;
        System.out.println(rectangle2);

        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());

    }
}
