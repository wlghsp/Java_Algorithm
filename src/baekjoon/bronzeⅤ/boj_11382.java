package baekjoon.bronzeⅤ;

import java.io.*;
import java.util.StringTokenizer;

public class boj_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(a+b+c));
        bw.flush();
        bw.close();
        br.close();
    }
}
