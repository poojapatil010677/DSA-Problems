// https://leetcode.com/problems/isomorphic-strings/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> lookUp = new HashMap<>();
        
        if (s.length() != t.length()) {
            return false;
        }
        
        for (int i=0; i< s.length(); i++) {
            
            // the character is not present in the map
            if (!lookUp.containsKey(s.charAt(i))) {
                
                // has the value
                if(lookUp.containsValue(t.charAt(i))) {
                    return false;
                }
                
                // does not have the val
                lookUp.put(s.charAt(i), t.charAt(i));
                
            } else {
            // the character is present in the map
            if (t.charAt(i) != lookUp.get(s.charAt(i)))
                return false;
            }
            
        }
        
        return true; 
        
    }
}

