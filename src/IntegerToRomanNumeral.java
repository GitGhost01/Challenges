/*
Code Wars Challenge

Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero.
In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

conversion.solution(1000); //should return "M"
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000

Remember that there can't be more than 3 identical symbols in a row.

More about roman numerals - http://en.wikipedia.org/wiki/Roman_numerals
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRomanNumeral {

    public static void main(String[] args) {
        System.out.println(solution(1000)); //Expected output: M
        System.out.println(solution(987)); //Expected output: CMLXXXVII
        System.out.println(solution(3668)); //Expected output: MMMDCLXVIII
        System.out.println(solution(4)); //Expected output: IV
    }

    public static String solution(int n) {

        //LinkedHashMap used to maintain insertion order
        Map <String,Integer> map = new LinkedHashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        if (n < 1 || n > 3999) {
            throw new IllegalArgumentException("Number must be an integer between 1 and 3999.");
        }

        StringBuilder romanNumeral = new StringBuilder();

        //Need to traverse the Hash Map
        //To see if highest value can be subtracted from parameter and thus append it to the String to be returned
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            String romanSymbol = entry.getKey();
            int value = entry.getValue();

            while (n >= value) {
                romanNumeral.append(romanSymbol);
                n -= value;
            }
        }

        return romanNumeral.toString();
    }
}



