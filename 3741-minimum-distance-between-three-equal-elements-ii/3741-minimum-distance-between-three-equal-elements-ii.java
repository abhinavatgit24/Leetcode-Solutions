import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        int ans = Integer.MAX_VALUE;
        
        for (List<Integer> list : map.values()) {
            int m = list.size();
            if (m < 3) continue;
            
            for (int i = 0; i + 2 < m; i++) {
                int a = list.get(i);
                int b = list.get(i + 1);
                int c = list.get(i + 2);
                int d = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                ans = Math.min(ans, d);
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}