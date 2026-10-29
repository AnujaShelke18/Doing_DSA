class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String> > map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
           char[] letters = strs[i].toCharArray();   // 1. split the String into an array of characters
           Arrays.sort(letters);                  // 2. sort that array in place
           String key = new String(letters);      // 3. build a String back from the sorted characters
           map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
           
       } 
       return new ArrayList<>(map.values());
    }
}