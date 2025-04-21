import java.util.*;

class shape {
    void area(int radius) {

        System.out.println("AREA OF CIRCLE=" + 3.14 * radius * radius);
    }

    void area(int length, int breadth) {
        System.out.println("AREA OF RECTANGLE=" + length * breadth);
    }

    public static void main(String[] args) {
        shape circle = new shape();
        shape rectangle = new shape();
        circle.area(4);
        rectangle.area(3, 6);
    }
}
