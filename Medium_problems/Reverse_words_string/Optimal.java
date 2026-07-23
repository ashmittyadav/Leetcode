package Medium_problems.Reverse_words_string;

import java.util.Arrays;

public class Optimal {
    public static void main(String[] args) {
        String s = "  hello  world  ";
        if(s == null || s.isEmpty()) {
            // return "";
            System.out.println("");
        }
        String[] words = s.trim().split("\\s+");                    // removing trailing zerors and splitting through spaces  \s -> any speacial character
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1; i >= 0 ; i--) {
            if(result.length() > 0) {
                result.append(' ');
            }
            result.append(words[i]);
        }
        // return result.toString();
        System.out.println(result);
        }
    }
