/*
Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.

Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".

 

Example 1:

Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.

Example 2:

Input: a = "a", b = "aa"
Output: 2   
*/
// package Medium_problems.Repeated_string_match;

public class Solution {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        int count = 1;
        int ans = 0;
        StringBuilder sb = new StringBuilder(a);
        StringBuilder sb2 = new StringBuilder(b);
        while(!a.isEmpty()) {
            if(sb.contains(b)) {
                ans = count;
                break;
            }
            else {
                sb.append(a);
                count++;
            }
        }
        // return ans;
        System.out.println(ans);
    }
}
