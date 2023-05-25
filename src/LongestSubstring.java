/*
Leet Code Question

3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

*/

public class LongestSubstring {

    public static int lengthOfLongestSubstring (String s) {

        int maxLength = 0;

        for (int i =0; i < s.length(); i++) {

            StringBuilder currentSubstring = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {  //checks if repeated character has been added
                    break;
                }
                currentSubstring.append(s.charAt(j));

                if (currentSubstring.length() > maxLength) { //updates the maxLength if/when a longer substring is found
                    maxLength = currentSubstring.length();
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

}
