package baekjoon.bronze.bronzeⅢ.boj15633_FanDeath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = IntStream.rangeClosed(1, N).filter(i -> N % i == 0).sum();
        System.out.println(sum * 5 - 24);
    }
}
