/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true


Example 2:
Input: s = "()[]{}"
Output: true


Example 3:
Input: s = "(]"
Output: false


Example 4:
Input: s = "([])"
Output: true


Example 5:
Input: s = "([)]"
Output: false

*/


import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "([)]";
        Stack<Character> st = new Stack<>();

            for(char ch : s.toCharArray()) {
                if(ch == '(' || ch == '[' || ch == '{') {
                    st.push(ch);
                }
                else {
                    if(st.isEmpty()) {
                        // return false;
                        System.out.println("false");
                    }
                    char top = st.peek();
                    if(ch == ')' && top != '(') {
                        // return false;
                        System.out.println("false");
                    }
                    if(ch == ']' && top != '[') {
                            System.out.println("false");
                            // rerurn false;
                        }
                    if (ch == '}' && top != '{') {
                            System.out.println("false");
                            // return false;
                        }
                    // else {
                    //         System.out.println("false");
                    //         // return false;
                    //     }
                    }
                }
                
                // return st.isEmpty();
            }
    }
