import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z ]", " ");
        
        String[] words = paragraph.split("\\s+");
        
        HashSet<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b);
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        
        String result = "";
        int max = 0;
        
        for (String word : words) {
            
            if (bannedSet.contains(word)) continue;
            
            map.put(word, map.getOrDefault(word, 0) + 1);
            
            if (map.get(word) > max) {
                max = map.get(word);
                result = word;
            }
        }
        
        return result;
    }
}