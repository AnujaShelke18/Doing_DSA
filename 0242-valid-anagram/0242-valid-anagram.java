class Solution {
    public boolean isAnagram(String s, String t) {
        //if length of both the strings are not equal then return false
        if(s.length() != t.length()){
            return false;
        }
       //array to count frequency of each letter
        int[] charCount = new int[26];
          
        //++ for s and -- for t
         for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
         
         //if the count is 0 then its a valid anagram
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    }
