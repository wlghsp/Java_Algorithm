package baekjoon.bronze.bronzeⅣ.boj8723_Patyki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean equilateralTriangle = false;
        boolean rightTriangle = false;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[0]) equilateralTriangle = true;
        if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) rightTriangle = true;
        if (!equilateralTriangle && !rightTriangle) System.out.println(0);
        else if (rightTriangle) System.out.println(1);
        else System.out.println(2);
    }
}
