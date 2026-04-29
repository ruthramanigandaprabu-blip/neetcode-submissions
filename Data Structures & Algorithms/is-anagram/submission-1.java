class Solution {
    public boolean isAnagram(String s, String t) {
       int[] countArrayA = new int[26];
        int[] countArrayB = new int[26];
        for(char currentChar : s.toCharArray()) {
            countArrayA[Character.toLowerCase(currentChar)-'a']++;
        }
        for(char currentChar : t.toCharArray()) {
            countArrayB[Character.toLowerCase(currentChar)-'a']++;
        }
        return Arrays.equals(countArrayA,countArrayB);
    }
}
