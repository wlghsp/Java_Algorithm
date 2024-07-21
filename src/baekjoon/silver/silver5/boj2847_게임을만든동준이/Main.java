package baekjoon.silver.silver5.boj2847_게임을만든동준이;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj2847_게임을만든동준이/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        int count = 0;

        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] >= arr[i + 1]) {
                int decrement = arr[i] - arr[i + 1] + 1;
                count += decrement;
                arr[i] -= decrement;
            }
        }

        System.out.println(count);
    }
}
