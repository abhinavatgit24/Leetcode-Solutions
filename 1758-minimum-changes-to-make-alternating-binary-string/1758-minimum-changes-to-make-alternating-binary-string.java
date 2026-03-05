class Solution {
    public int minOperations(String s) {
        
        int sw0 = 0;
        int sw1 = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            if (i % 2 == 0) {
                if (c != '0') sw0++;
                if (c != '1') sw1++;
            } 
            else {
                if (c != '1') sw0++;
                if (c != '0') sw1++;
            }
        }
        
        return Math.min(sw0, sw1);
    }
}