package CodeUp;

import java.util.Scanner;

public class Test1086 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        scanner.close();

        double x = (a * b * c) / 8 / 1024 / 1024;

        System.out.printf("%.2f MB", x);

    }

}
