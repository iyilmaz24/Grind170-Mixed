import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dict = new HashMap<Character, Integer>();

        for (char a : ransomNote.toCharArray()) dict.put(a, dict.getOrDefault(a, 0) + 1);
        for (char b : magazine.toCharArray()) dict.put(b, dict.getOrDefault(b, 0) - 1);
        
        for (char key : dict.keySet()) if (dict.getOrDefault(key, 1) > 0) return false;
        return true;
    }
}