
class A {
    static int c;

    static void count() {
        c++;

    }

    static void display() {
        System.out.println(c);
    }
}

class B {

    public static void main(String args[]) {
        A.c = 0;
        A.display();
        A.count();
        A.display();
        A.count();
        A.count();
        A.display();
    }
}
