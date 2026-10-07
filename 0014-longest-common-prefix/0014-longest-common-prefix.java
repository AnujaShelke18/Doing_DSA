class Solution {
    public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    
    // Loop through each character index of the first word
    for (int i = 0; i < strs[0].length(); i++) {
        char c = strs[0].charAt(i);
        
        // Check this character against all other words
        for (int j = 1; j < strs.length; j++) {
            // If the current word is too short or character doesn't match
            if (i == strs[j].length() || strs[j].charAt(i) != c) {
                return strs[0].substring(0, i);
            }
        }
    }
    
    return strs[0];
}


    }
