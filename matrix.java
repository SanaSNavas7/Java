import java.util.Scanner;

class matrix {

    int matrix[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);

    matrix() {
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    int trans[][] = new int[3][3];

    void transpose() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
    }

    void add(matrix m1) {
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println(this.matrix[i][j] + m1.matrix[i][j]);
            }
            System.out.println();
        }
    }

    void multi(matrix m1) {
        int mul[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {
                    mul[i][j] += this.matrix[i][k] * m1.matrix[k][j];
                }
                System.out.println(mul[i][j]);
            }
            System.out.println();
        }
    }

    void display() {
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matrix m = new matrix();
        matrix m1 = new matrix();

        while (true) {
            System.out.println("Choose an operation:\n1.Transpose\n2.Add\n3.Multiply\n4.Display\n");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    m.transpose();
                    break;
                case 2:
                    m.add(m1);
                    break;
                case 3:
                    m.multi(m1);
                    break;
                case 4:
                    m.display();
                default:
                    System.out.println("Invalid option");

            }
        }
    }
}
