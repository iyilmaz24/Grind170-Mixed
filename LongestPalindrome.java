import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> dict = new HashMap<Character, Integer>();

        for(char ch : s.toCharArray()) dict.put(ch, dict.getOrDefault(ch, 0) + 1);

        boolean middleChar = false; 
        int total = 0;

        for(char key : dict.keySet()) {
            int occurences = dict.get(key);

            if (occurences % 2 == 0) total += occurences;
            else if (middleChar && occurences != 0) total += (occurences - 1);
            else if (!middleChar && occurences != 0) {
                total += occurences; 
                middleChar = true;
            }
        }

        return total;
    }
}