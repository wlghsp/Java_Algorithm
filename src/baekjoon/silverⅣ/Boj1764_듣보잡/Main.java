package baekjoon.silverⅣ.Boj1764_듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();

        for (int i = 0; i < N; i++) {
            s1.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            s2.add(br.readLine());
        }



    }
}
