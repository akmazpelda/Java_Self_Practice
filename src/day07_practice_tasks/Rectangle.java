package day07_practice_tasks;

public class Rectangle {

    public double width;
    public double length;

    public double calculateArea(){

        return width * length;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }


}
