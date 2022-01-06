package CodeUp;

import java.util.Scanner;

public class Test1087 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = 0;

        scanner.close();

        for (int i=1; i<=n; i++) {
            m += i;
            if (m >= n) {
                break;
            }
        }
        System.out.println(m);
    }

}
