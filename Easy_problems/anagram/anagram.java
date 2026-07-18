/*Given two strings s and t, 
return true if t is an anagram of s,
and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true*/




class Solution {
    public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {             // check both string lengths are equal if not equal return false
                return false;
            }
            int[] count = new int[26];                  // make an array name count which contain cahracters
            for(int i = 0; i < s.length() ; i++) {      
                count[s.charAt(i) - 'a']++;             //character at i position in string s will increment count of that character 
                count[t.charAt(i) - 'a']--;             //character at i position in string t will increment count of that character 
            }
            for(int sum : count) {                      
                if(sum != 0) return false;              //if sum is not equal to zero then return false the end sum should be zero
            }
            return true;
        }
}
