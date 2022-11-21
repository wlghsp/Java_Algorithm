package baekjoon.bronze.bronzeⅣ.boj19944_뉴비의기준은뭘까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if (M == 1 || M == 2) System.out.println("NEWBIE!");
        else if (N >= M && M != 1 && M != 2) System.out.println("OLDBIE!");
        else System.out.println("TLE!");
    }
}
