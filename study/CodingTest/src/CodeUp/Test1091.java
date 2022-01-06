package CodeUp;

import java.util.Scanner;

public class Test1091 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        long result = a;

        scanner.close();

        for (int i=1; i<n; i++) {
            result = result * m + d;
        }

        System.out.println(result);

    }

}
