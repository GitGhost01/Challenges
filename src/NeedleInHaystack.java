/*
Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle, so:

Example(Input --> Output)

["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
*/

import java.util.Arrays;
import java.util.Scanner;

public class NeedleInHaystack {
    public static void main(String[] args) {
        String result = findNeedle();
        System.out.println(result);
    }

    static String findNeedle() {
        Scanner input = new Scanner(System.in);

        System.out.print("How many words will you enter: ");
        int length = input.nextInt();
        System.out.println("Begin entering your words, be sure to include the word 'needle' as one of your words");

        String[] haystack = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Current word - " + (i + 1) + ": ");
            haystack[i] = input.next();
        }
        input.close();

        System.out.println("The words you entered were:");
        System.out.println(Arrays.toString(haystack));

        String needleFound = "";
        for (int i = 0; i < length; i++) {
            if (haystack[i].equals("needle")) {
                needleFound = ("Found the needle at position " + i);
            }
        }
        return needleFound;
    }
}
