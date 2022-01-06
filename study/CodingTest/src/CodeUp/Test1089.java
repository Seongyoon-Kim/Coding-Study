package CodeUp;

import java.util.Scanner;

public class Test1089 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0;

        scanner.close();

        result = a + (n-1) * b;

        System.out.println(result);

    }

}
