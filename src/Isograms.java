/*
Code Wars Challenge

An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false
*/

public class Isograms {
    public static boolean isIsogram(String str) {

        str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {    //j = i + 1 allows loop for chars to be compared to subsequent chars
                if (currentChar == str.charAt(j)) {
                    return false; //duplicate found
                }
            }
        }

        return true; // duplicate not found
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics")); //Outputs true
        System.out.println(isIsogram("moose")); //Outputs false
        System.out.println(isIsogram("aba")); //Outputs false
    }

}