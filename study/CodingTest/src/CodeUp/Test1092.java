package CodeUp;

import java.util.Scanner;

public class Test1092 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = 1;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        while(true) {
            if (day % a == 0 && day % b == 0 && day % c == 0) {
                break;
            }
            day++;
        }

        System.out.println(day);

    }

}
