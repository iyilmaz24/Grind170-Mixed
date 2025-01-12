class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];
        int len = s.length();

        for (int i = 0; i < len; i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) if (freq[i] != 0) return false;
    
        return true;
    }
}