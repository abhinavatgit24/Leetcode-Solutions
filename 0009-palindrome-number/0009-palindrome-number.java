class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) return false;

        int dup = n;
        int rev = 0;

        while (n > 0) {
            int ld = n % 10;
            n /= 10;
            rev = rev * 10 + ld;
        }

        return dup == rev;
    }
}
