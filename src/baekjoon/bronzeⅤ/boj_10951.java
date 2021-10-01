package baekjoon.bronzeⅤ;

import java.io.*;
import java.util.StringTokenizer;

public class boj_10951 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";

        while ((str=br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a+b + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
