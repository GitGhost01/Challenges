/*
Code Wars Challenge

Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
*/

public class SubtractListFromAnotherList {

    public static int[] arrayDiff(int[] a, int[] b) {

        // Create a new array to store the result
        int[] result = new int[a.length];
        int index = 0;

        // Iterate over the elements of array 'a'
        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            // Check if the element exists in array 'b'
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            // If the element doesn't exist in array 'b', add it to the result array
            if (!found) {
                result[index] = a[i];
                index++;
            }
        }

        // Create a new array with the correct size
        int[] trimmedResult = new int[index];

        return trimmedResult;
    }

}
