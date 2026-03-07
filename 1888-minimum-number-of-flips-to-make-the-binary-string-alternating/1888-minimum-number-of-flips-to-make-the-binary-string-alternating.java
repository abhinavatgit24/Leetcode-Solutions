class Solution {
    public int minFlips(String s) {
        
        int n = s.length();
        String str = s + s;
        
        int diff1 = 0;
        int diff2 = 0;
        int res = Integer.MAX_VALUE;
        
        int left = 0;
        
        for (int right = 0; right < str.length(); right++) {
            
            char c = str.charAt(right);
            
            if (c != (right % 2 == 0 ? '0' : '1')) diff1++;
            if (c != (right % 2 == 0 ? '1' : '0')) diff2++;
            
            if (right - left + 1 > n) {
                
                char leftChar = str.charAt(left);
                
                if (leftChar != (left % 2 == 0 ? '0' : '1')) diff1--;
                if (leftChar != (left % 2 == 0 ? '1' : '0')) diff2--;
                
                left++;
            }
            
            if (right - left + 1 == n) {
                res = Math.min(res, Math.min(diff1, diff2));
            }
        }
        
        return res;
    }
}