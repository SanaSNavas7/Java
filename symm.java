import java.util.Scanner;

public class symm {
    Scanner sc = new Scanner(System.in);

    int n;
    int trans[][] = new int[20][20];

    int matrix[][] = new int[20][20];

    symm() {
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
    }

    void trans() {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                trans[i][j] = matrix[j][i];

            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(trans[i][j] + " ");
            }
            System.out.println();

        }
    }

    void sym() {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != trans[i][j]) {
                    flag = 1;
                    break;

                }
            }
        }

        if (flag == 0) {
            System.out.println("The matrix is not symmetric");
        } else {

            System.out.println("The matrix is  symmetric");
        }
    }

    public static void main(String[] args) {
        symm a = new symm();
        a.trans();
        a.sym();
    }
}