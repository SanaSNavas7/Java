import java.util.Scanner;

public class sorts {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];
        System.out.println("enter 5 strings");
        for (int i = 0; i < 5; i++) {

            s[i] = sc.nextLine();
        }
        for (int i = 0; i < 4; i++) {

            for (int j = i + 1; j < 5; j++) {
                if (s[i].compareTo(s[j]) > 0) {

                    String temp = s[i];
                    s[i] = s[j];

                    s[j] = temp;

                }
            }
        }
        System.out.println("sorted string is:");
        for (String str : s) {

            System.out.println(str);
        }
    }
}
