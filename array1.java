import java.util.*;

class array1 {
    public static void main(String[] args) {

        int A[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int size = sc.nextInt();
        A = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Elements are:");
        for (int i = 0; i < size; i++) {

            System.out.println(A[i]);

        }
        int l = A.length();
        System.out.println(l);
    }

}
