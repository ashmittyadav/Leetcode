/*  A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.*/

// optimized solution 

class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            while(l < r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l < r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
            }
            return true;

        }
        }


// not optimized solution

// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.toLowerCase();
//         s = s.replaceAll("[^a-z0-9]","");
//         int n = s.length();
        
//         for(int i = 0; i < n/2 ;i++) {
//             if(s.charAt(i) != s.charAt(n-1-i)) {
//                 return false;
//             }
//          }
//             return true;
//     }
//     }