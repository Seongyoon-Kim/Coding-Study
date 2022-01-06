package CodeUp;

import java.util.Scanner;

public class Test1083 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i=1; i<=n; i++) {

            if (i % 3 == 0 || i % 6 == 0 || i % 9 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }

        }

    }

}
