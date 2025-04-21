import java.util.Scanner;

public class complex {
    double real;

    double img;

    complex() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part");

        this.real = sc.nextDouble();
        System.out.println("Enter img part");
        this.img = sc.nextDouble();

    }

    public static void main(String[] args) {
        complex c1 = new complex();
        complex c2 = new complex();
        double r = c1.real + c2.real;
        double i = c1.img + c2.img;
        System.out.println(r + "+" + i + "i");
    }
}
