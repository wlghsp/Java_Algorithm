package leetcode.greedy.leetcode45_jump_game_2;

public class Solution {

    public int jump(int[] nums) {
        int result = 0;

        int left = 0, right = 0;

        while (right < nums.length - 1) {
            int farthest = 0;
            for (int i = left; i < right + 1; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            left = right + 1;
            right = farthest;
            result++;
        }

        return result;
    }
}
