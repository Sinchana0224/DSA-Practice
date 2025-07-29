/*
🟠 ASCII Range Sum

📌 Problem:
Given a string s consisting of lowercase English letters, for every character whose first and last occurrences are at different positions, calculate the sum of ASCII values of characters strictly between its first and last occurrence.
Return all such non-zero sums (order does not matter).

🔹 Examples:

Input: s = "abacab"
Output: [293, 294]
Explanation:
- 'a': between positions 1 and 5 → b, a, c → ASCII sum = 98 + 97 + 99 = 294
- 'b': between positions 2 and 6 → a, c, a → ASCII sum = 97 + 99 + 97 = 293

Input: s = "acdac"
Output: [197, 199]
Explanation:
- 'a': between positions 1 and 4 → c, d → ASCII sum = 99 + 100 = 199
- 'c': between positions 2 and 5 → d, a → ASCII sum = 100 + 97 = 197

🔸 Constraints:
1 ≤ s.length() ≤ 10^5
Only lowercase English letters.
*/

import java.util.*;

public class AsciiRangeSum {
    public static ArrayList<Integer> asciirange(String s) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Character> visited = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!visited.contains(ch)) {
                visited.add(ch);
                int first = s.indexOf(ch);
                int last = s.lastIndexOf(ch);

                if (first < last - 1) {
                    int sum = 0;
                    for (int j = first + 1; j < last; j++) {
                        sum += (int) s.charAt(j);
                    }
                    res.add(sum);
                }
            }
        }

        return res;
    }

    // Sample test cases
    public static void main(String[] args) {
        String input1 = "abacab";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + asciirange(input1));

        String input2 = "acdac";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + asciirange(input2));
    }
}
