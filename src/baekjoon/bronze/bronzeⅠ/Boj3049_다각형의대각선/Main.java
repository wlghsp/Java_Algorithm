package baekjoon.bronze.bronzeⅠ.Boj3049_다각형의대각선;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(N * (N-1) * (N-2) * (N-3) / 24);
    }
}
