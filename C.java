class A {
    A() {

        System.out.println("hai");
    }
}

class B extends A {

    B() {

        System.out.println("hello");
    }
}

class C extends B {

    C() {
        System.out.println("Nazrin");
    }

    public static void main(String args[]) {
        C ob = new C();

    }
}