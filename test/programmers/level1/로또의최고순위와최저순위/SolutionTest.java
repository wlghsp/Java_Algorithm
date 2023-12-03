package programmers.level1.로또의최고순위와최저순위;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        int[] result2 = s.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
        int[] result3 = s.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});

        assertArrayEquals(new int[]{3, 5}, result1);
        assertArrayEquals(new int[]{1, 6}, result2);
        assertArrayEquals(new int[]{1, 1}, result3);
    }
}