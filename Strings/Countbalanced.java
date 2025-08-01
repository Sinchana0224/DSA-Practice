/*
 * Problem: Count Balanced Subarrays (Equal Vowels and Consonants)
 * Platform: GeeksforGeeks
 * Status: Passed 1110 / 1115 test cases, optimized for performance
 * 
 * ✅ Approach:
 * - Use a HashSet to store vowels.
 * - Use a prefix sum approach: 
 *    - +1 for each vowel
 *    - -1 for each consonant
 * - Maintain a HashMap to count prefix balances.
 * - If a prefix sum (balance) is seen again, it means the elements in between are balanced.
 *
 * 🔍 Time Complexity: O(N * avg_word_length)
 * 📦 Space Complexity: O(N) for HashMap to track balances
 *
 * ✅ Example:
 * Input: ["aeio", "aa", "bc", "ot", "cdbd"]
 * Output: 4
 */

import java.util.*;

class Solution {
    public int countBalanced(String[] arr) {
        HashSet<Character> vowels = new HashSet<>();
        for (char ch : new char[]{'a', 'e', 'i', 'o', 'u'}) {
            vowels.add(ch);
        }

        Map<Integer, Integer> balanceMap = new HashMap<>();
        balanceMap.put(0, 1);  // For prefix balance at the start

        int balance = 0;
        int totalBalanced = 0;

        for (String word : arr) {
            for (char ch : word.toCharArray()) {
                if (vowels.contains(ch)) {
                    balance++;
                } else {
                    balance--;
                }
            }
            totalBalanced += balanceMap.getOrDefault(balance, 0);
            balanceMap.put(balance, balanceMap.getOrDefault(balance, 0) + 1);
        }

        return totalBalanced;
    }
}
