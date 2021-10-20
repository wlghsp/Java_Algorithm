package baekjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n0, n1, n4;
        String n1_is = "";
        int i = 1;
        while (true) {
           n0 = Integer.parseInt(br.readLine());
           if (n0 == 0) break;
           n1 = 3 * n0;
           if (n1 % 2 == 0) {
               n1_is = "even";
            } else {
               n1_is = "odd";
           }
           if (n1_is == "even") {
               n4 = n0/2;
           } else {
               n4 = (n0-1)/2;
           }
           bw.write(i + ". " + n1_is + " " + n4 +"\n");
           i++;
        }
        bw.flush();
        bw.close();
    }
}
