package baekjoon.bronze.bronze5.boj27866_문자와문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s.charAt(Integer.parseInt(br.readLine()) - 1));
    }
}
