package baekjoon.bronzeⅢ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_2985 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); 
        }

        if (arr[0] + arr[1] == arr[2]) {
            bw.write(arr[0] + "+" + arr[1] + "=" + arr[2]);
        } else if (arr[0] - arr[1] == arr[2]) {
            bw.write(arr[0] + "-" + arr[1] + "=" + arr[2]);
        } else if (arr[0] * arr[1] == arr[2]) {
            bw.write(arr[0] + "*" + arr[1] + "=" + arr[2]);
        } else if (arr[0] / arr[1] == arr[2]) {
            bw.write(arr[0] + "/" + arr[1] + "=" + arr[2]);
        } else if (arr[0] == arr[1] + arr[2]) {
            bw.write(arr[0] + "=" + arr[1] + "+" + arr[2]);
        } else if (arr[0] == arr[1] - arr[2]) {
            bw.write(arr[0] + "=" + arr[1] + "-" + arr[2]);
        } else if (arr[0] == arr[1] * arr[2]) {
            bw.write(arr[0] + "=" + arr[1] + "*" + arr[2]);
        } else if (arr[0] == arr[1] / arr[2]) {
            bw.write(arr[0] + "=" + arr[1] + "/" + arr[2]);
        } 
        bw.flush();
        bw.close();

    }
}