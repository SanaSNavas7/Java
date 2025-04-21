import java.util.*;

class base {
    base() {
        System.out.println("This is base default constructor");
    }

    void display() {
        System.out.println("This is base display function");
    }
}

class child1 extends base {
    int x;

    child1() {
        System.out.println("This is child default constructor");
    }

    void display(int m) {
        x = m;
        System.out.println(x);
    }

    public static void main(String args[]) {
        child1 obj = new child1();
        obj.display();
        obj.display(2);

    }
}