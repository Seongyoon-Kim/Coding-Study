package CodeUp;

import java.io.*;
import java.util.Scanner;

public class Test1084 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] number = br.readLine().split(" ");
        int count = 0;

        for (int i=0; i<Integer.valueOf(number[0]); i++) {
            for (int j=0; j<Integer.valueOf(number[1]); j++) {
                for (int k=0; k<Integer.valueOf(number[2]); k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();

    }

}
