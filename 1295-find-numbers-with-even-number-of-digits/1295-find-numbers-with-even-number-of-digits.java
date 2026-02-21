class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int n : nums) {

            int digits = 0;
            int x = n;

            while (x > 0) {
                x /= 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}