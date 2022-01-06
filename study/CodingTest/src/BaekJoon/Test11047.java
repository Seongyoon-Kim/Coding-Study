package BaekJoon;

import java.util.Scanner;

public class Test11047 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] coin = new int[N];
        int count = 0;

        for (int i=0; i<N; i++) {
            coin[i] = scanner.nextInt();
        }

        for (int i=N-1; i>=0; i--) {

            if (coin[i] <= K) {
                count += (K / coin[i]);
                K = K % coin[i];
            }
        }

        System.out.println(count);

    }

}
