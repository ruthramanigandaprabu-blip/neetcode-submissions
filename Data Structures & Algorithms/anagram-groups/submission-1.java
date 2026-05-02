class Solution {
   
    
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String , List<String>> anagrams=new HashMap<>();
       for(String str:strs){
           char[] sortedCurrentWord = str.toCharArray();
           Arrays.sort(sortedCurrentWord);
           String key = new String(sortedCurrentWord);
           anagrams.computeIfAbsent(key, k -> new ArrayList<String>()).add(str);
       }
       return new ArrayList<>(anagrams.values());
    }
}
