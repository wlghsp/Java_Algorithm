package programmers.level2.H_Index;

import java.util.Arrays;

public class Solution {

    public int solution(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}
