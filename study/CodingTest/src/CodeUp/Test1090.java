package CodeUp;

import java.util.Scanner;

public class Test1090 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();
        long result = 0;

        scanner.close();

        result = (long)(a * Math.pow(r, n-1));

        System.out.println(result);

    }

}
