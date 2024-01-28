package leetcode.arrays_hashing.leetcode49_Group_Anagrams;

import java.util.*;

public class Solution {


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            map.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
