package Medium_problems.Smallest_palindromic_rearrangement-I;

public class Solution {
    public static void main(String[] args) {
        String s = "dacad";

        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
    }
}
