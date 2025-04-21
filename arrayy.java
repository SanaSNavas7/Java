import java.util.Scanner;

public class arrayy {
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);

    arrayy() {
        for (

                int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void search() {

        System.out.println("Enter the element to be searched:");
        int a = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == a) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found");

        } else {
            System.out.println("Element not found ");
        }
    }

    public static void main(String[] args) {
        arrayy ob = new arrayy();
        ob.search();
    }
}
