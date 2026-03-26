class Solution {
    public int splitArray(int[] nums, int k) {
        
        int left = 0, right = 0;
        
        for (int num : nums) {
            left = Math.max(left, num); // max element
            right += num;               // total sum
        }
        
        int ans = right;
        
        while (left <= right) {
            
            int mid = left + (right - left) / 2;
            
            int count = 1;
            int sum = 0;
            
            for (int num : nums) {
                
                if (sum + num > mid) {
                    count++;
                    sum = num;
                } else {
                    sum += num;
                }
            }
            
            if (count <= k) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return ans;
    }
}