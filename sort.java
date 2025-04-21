import java.util.*;

class sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = obj.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }

        for (int i = 0; i < size; i++) {

            if (array[i] > array[i + 1]) {

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

            }

        }

        System.out.println("elements in sorted order: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}