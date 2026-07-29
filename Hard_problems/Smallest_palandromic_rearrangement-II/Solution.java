/*
You are given a palindromic string s and an integer k.

Return the k-th lexicographically smallest palindromic permutation of s. If there are fewer than k distinct palindromic permutations, return an empty string.

Note: Different rearrangements that yield the same palindromic string are considered identical and are counted once.

 

Example 1:

Input: s = "abba", k = 2

Output: "baab"

Explanation:

The two distinct palindromic rearrangements of "abba" are "abba" and "baab".
Lexicographically, "abba" comes before "baab". Since k = 2, the output is "baab".
Example 2:

Input: s = "aa", k = 2

Output: ""

Explanation:

There is only one palindromic rearrangement: "aa".
The output is an empty string since k = 2 exceeds the number of possible rearrangements.
Example 3:

Input: s = "bacab", k = 1

Output: "abcba"
*/

class Solution {
    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int[] half = new int[26];
        StringBuilder mid = new StringBuilder();
        int m = 0;

        // fixing mid
        for(int i = 0 ; i < 26 ; i++) {
            if(freq[i] % 2 == 1) mid.append((char)('a' + i));
            
            half[i] = freq[i]/2;
            m += half[i];
        }

        if(ways(half, k) < k) return "";    // if number of ways is less than k then return empty string

        // buolding first half of string
        StringBuilder firstHalf = new StringBuilder();
        for(int i = 0 ; i < m ;i++) {
            for(int c = 0 ; c < 26 ;c++) {
                if(half[c] > 0) {
                    half[c]--;
                    long ways = ways(half,k);
                    if(ways >= k) {
                        firstHalf.append((char)('a' + c));
                        break;
                    } else {
                        k -= ways;
                        half[c]++;
                    }
                }
            }
        }
        StringBuilder res = new StringBuilder(firstHalf);
        res.append(mid);
        res.append(firstHalf.reverse());
        return res.toString();
    }

    private long ways(int[] arr , long k) {
        long ways = 1;
        int curr = 0;

        for(int count : arr) {
            if(count > 0) {
                curr += count;
                long n = curr;
                long r = count;

                if(r > n - r) r = n - r;

                long comb = 1; 
                for(int i = 1; i <= r ;i++) {
                    comb = comb * (n -i + 1) / i;
                    if(comb > k) {
                        comb = k + 1;
                        break;
                    }
                } 
                ways *= comb;
                if(ways > k) return k+1;
            }
        }
        return ways;
    }
}
