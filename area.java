import java.util.*;

class area {

    float a, l, b;

    void area() {
        a = l * b;

        System.out.println("Area  of the rectangle is " + a);

    }

    public static void main(String[] args) {
        area rect1 = new area();
        rect1.l = 2;
        rect1.b = 4;
        rect1.area();
    }

}