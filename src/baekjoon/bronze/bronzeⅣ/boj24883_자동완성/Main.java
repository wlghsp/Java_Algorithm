package baekjoon.bronze.bronzeⅣ.boj24883_자동완성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        System.out.println(s.equals("n") ? "Naver D2" : "Naver Whale");
    }
}
