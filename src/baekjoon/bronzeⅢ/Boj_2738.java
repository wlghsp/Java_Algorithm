package baekjoon.bronzeⅢ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        for (int i = 1; i <= 9; i++) {
            bw.write(N+ " * " +i+ " = "+  (N * i)+ "\n");
        }
        bw.flush();
        bw.close();

    }
}