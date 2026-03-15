class Solution {
    public int maxProduct(int[] nums) {

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int num = nums[i];

            int tempMax = Math.max(num, Math.max(num * maxProd, num * minProd));
            int tempMin = Math.min(num, Math.min(num * maxProd, num * minProd));

            maxProd = tempMax;
            minProd = tempMin;

            result = Math.max(result, maxProd);
        }

        return result;
    }
}