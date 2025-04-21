import java.util.*;

class A {
    int x, y;

    A(int a, int b) {

        x = a;

        y = b;
    }

    void display() {

        System.out.println(x, y);
    }
}

class Bs extends A {
    int z;

    Bs(int a, int b, int c) {
        super(a, b);
        z = c;
        System.out.println(z);
    }

    void display() {
        super.display();
        System.out.println("This is derived class display function");
    }

    public static void main(String args[]) {
        Bs obj = new Bs(1, 2, 3);
        obj.display();
    }

}