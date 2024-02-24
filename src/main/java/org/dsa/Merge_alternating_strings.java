package org.dsa;

/*You are given two strings word1 and word2. Merge the strings by adding letters
in alternating order, starting with word1. If a string is longer than the other,
append the additional letters onto the end of the merged string.
Return the merged string.
Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r*/
public class Merge_alternating_strings {
    public static void main(String[] args) {
        String word1 ="abc";
        String word2 ="defg";
        StringBuffer sb = new StringBuffer();
                int k = 0;
        while(k< word1.length() || k < word2.length()){
            if(k <word1.length()){
                sb.append(word1.charAt(k));
            }
            if(k < word2.length()){
                sb.append(word2.charAt(k));
            }
            k++;
        }
        System.out.println(sb);
            }

        }

