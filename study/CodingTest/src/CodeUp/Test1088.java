package CodeUp;

import java.util.Scanner;

public class Test1088 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        scanner.close();

        for (int i=1; i<=number; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.printf("%d ", i);
        }

    }

}
