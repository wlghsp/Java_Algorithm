package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(1, 0);

    }


    static void dfs(int start, int loc) {

        //m 갯수에 맞게 배열을 모두 채웠으면 출력
        if (loc == M) {
            for (int val : arr) {
                System.out.print(val +" ");
            }
            System.out.println();
            return;
        } 

        //시작값을 정해줌으로써 visited처리를 확인하지 않아도 가능!
        for (int i = start; i <= N; i++) {
            arr[loc] = i;
            dfs(i + 1, loc + 1);
        }
    }
}
