import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        
        if (s.length() < p.length()) return result;
        
        int[] pCount = new int[26];
        int[] window = new int[26];
        
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            
            window[s.charAt(right) - 'a']++;
            
            if (right - left + 1 > p.length()) {
                window[s.charAt(left) - 'a']--;
                left++;
            }
            
            if (Arrays.equals(pCount, window)) {
                result.add(left);
            }
        }
        
        return result;
    }
}