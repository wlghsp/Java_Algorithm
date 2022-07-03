package baekjoon.bronze.bronzeⅢ.Boj10250_ACM호텔;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int floor = n % h;
            if (floor == 0) floor = h;
            int roomNum = (int) Math.ceil((double) n / h);
            if (roomNum < 10) {
                System.out.println(floor + "0" + roomNum);
            } else {
                System.out.println(String.valueOf(floor) + String.valueOf(roomNum));
            }
        }
    }
}
