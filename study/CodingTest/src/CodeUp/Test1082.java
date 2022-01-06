package CodeUp;

import java.util.Scanner;

public class Test1082 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(16);

        scanner.close();

        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\r\n", n, i, n * i);
        }

    }

}
