// https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {
        
        int[] count = new int[256];
        for(char c: s.toCharArray()) {
            count[c]++;
        }
        
        // palindrome length
        int result = 0;
        // check if we have a char without a partner. Odd element in the middle
        boolean odd = false;
        
        for(int v: count) {
            // if the count is odd, there is one extra element. If we do not have a middle element yet
            // then count this, else ignore the extra element and use only count-1.
            if(v % 2 == 1) {
                if (!odd) {
                    result+=1;
                    odd = true;
                }
                result += v-1;
            } else {
                // if the count is even, then each element can have a partner.
                result += v;
            }
            
        }
        return result;
    }
}