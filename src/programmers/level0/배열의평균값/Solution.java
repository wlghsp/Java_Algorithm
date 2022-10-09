package programmers.level0.배열의평균값;

import java.util.Arrays;

public class Solution {

    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); // 5.5
        System.out.println(s.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})); // 94.0
    }
}
