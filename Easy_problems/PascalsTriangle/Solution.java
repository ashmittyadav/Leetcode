/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:

Input: numRows = 1
Output: [[1]]
*/

package Easy_problems.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int num = 5;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i) {
                    list.add(1);
                }else { 
                    int val = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                    list.add(val);
                }
            }
            ans.add(list);
        }
        System.out.println(ans);
    }
}
