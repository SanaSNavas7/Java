import java.util.*;

class shape {
    shape(int radius) {
        System.out.println("area of circle=" + 3.14 * radius * radius);
    }

    shape(int length, int breadth) {
        System.out.println("Area of rectangle=" + length * breadth);
    }

    public static void main(String[] args) {

        shape c1 = new shape(2);
        shape r1 = new shape(2, 4);

    }
}