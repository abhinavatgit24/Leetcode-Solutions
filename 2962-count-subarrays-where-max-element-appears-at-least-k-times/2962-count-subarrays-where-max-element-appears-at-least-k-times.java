import java.util.*;

class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = 0;

        for (int num : nums) max = Math.max(max, num);

        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == max) pos.add(i);
        }

        long ans = 0;

        for (int i = 0; i + k - 1 < pos.size(); i++) {
            int left = (i == 0) ? pos.get(i) + 1 : pos.get(i) - pos.get(i - 1);
            int right = n - pos.get(i + k - 1);
            ans += (long) left * right;
        }

        return ans;
    }
}