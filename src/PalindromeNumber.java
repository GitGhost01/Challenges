/*
Leet Code Question

9. Palindrome Number

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:
-231 <= x <= 231 - 1
*/

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); //true
        System.out.println(isPalindrome(7892)); //false
        System.out.println(isPalindrome(-11)); //false
    }

    public static boolean isPalindrome(int x) {
            String str = Integer.toString(x);

            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(str);

            String reverseStr = String.valueOf(stringBuilder.reverse());

            return (reverseStr.equals(str)); //does the same as if else statement (true IF met, ELSE returns false)
    }
}
