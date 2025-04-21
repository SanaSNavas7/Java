class animal1 {
    String color = "Red";
}

class animal2 extends animal1 {
    String color = "Blue";

    void color_display() {
        System.out.println(color);
        System.out.println("color of parent class :" + super.color);
    }

    public static void main(String[] args) {

        animal2 ob = new animal2();
        ob.color_display();

    }
}