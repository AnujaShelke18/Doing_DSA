class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
           char[] letters = strs[i].toCharArray();
           Arrays.sort(letters);
           String key = new String(letters);

           map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}