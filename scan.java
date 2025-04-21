import java.util.*;

class scan {
    void area(int radius) {
        System.out.println("Area of circle=" + 3.14 * radius * radius);
    }

    void area(int length, int breadth) {
        System.out.println("Area of rectangle=" + length * breadth);
    }

    public static void main(String[] args) {
        scan c = new scan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int rad = sc.nextInt();
        c.area(rad);
    }
}
