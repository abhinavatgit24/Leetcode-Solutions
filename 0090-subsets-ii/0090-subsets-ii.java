import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int idx, int[] nums, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;

            curr.add(nums[i]);
            backtrack(i + 1, nums, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}