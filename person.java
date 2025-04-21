public class person {
    String name;
    int age;

    person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        // creating an array of objects for the class person
        person p[] = new person[3];
        // initialising objects
        p[0] = new person("ABC", 15);
        p[1] = new person("DEF", 16);
        p[2] = new person("GHI", 17);
        // accessing objects in the array
        for (int i = 0; i < 3; i++) {
            p[i].display();
        }
    }
}
