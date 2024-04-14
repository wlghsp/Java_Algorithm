package leetcode.graph.leetcode417_pacific_atlantic_water_flow;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();

        int rows = heights.length, cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for (int i = 0; i < cols; i++) {
            dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
            dfs(heights, rows - 1, i, Integer.MIN_VALUE, atlantic);
        }

        for (int i = 0; i < rows; i++) {
            dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, i, cols - 1, Integer.MIN_VALUE, atlantic);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    res.add(List.of(i, j));
                }
            }
        }

        return res;
    }

    private void dfs(int[][] heights, int i, int j, int prev, boolean[][] ocean) {
        if (i < 0 || i >= ocean.length || j < 0 || j >= ocean[0].length || ocean[i][j]
        || heights[i][j] < prev) {
            return;
        }
        ocean[i][j] = true;
        for (int[] dir : dir) {
            dfs(heights, i + dir[0], j + dir[1], heights[i][j], ocean);
        }
    }


}
