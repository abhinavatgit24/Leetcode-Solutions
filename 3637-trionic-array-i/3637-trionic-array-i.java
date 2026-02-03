class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 0;

        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;

        int mid1 = i;

        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == mid1) return false;

        int mid2 = i;

        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == mid2) return false;

        return i == n - 1;
    }
}
