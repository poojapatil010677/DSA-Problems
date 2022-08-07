// https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        
        // if the lenght of s is 0, it is always a subsequence. 
        if (s.length() == 0) {
            return true;
        }
        
        while(i < s.length()) {
            
            // if string t is completely traversed.
            if (j == t.length()) {
                return false;
            }
            
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
            
        }
        return true;
    }
}