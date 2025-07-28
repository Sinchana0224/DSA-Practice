/*
🧮 Problem: More Frequent Element (x or y)
🔗 Source: GFG / Custom
📂 Topic: Arrays / Frequency
⚙️ Difficulty: Easy
📅 Date Solved: 28/07/2025

✍️ Problem Summary:
Given an array and two elements x and y, return the one that appears more frequently.
If both have the same frequency, return the smaller one.

💡 Approach:
- Loop through the array once and maintain two counters for x and y.
- Compare the counters:
    → If freqX > freqY, return x
    → If freqY > freqX, return y
    → Else, return min(x, y)

🧠 Technique Used:
Simple frequency count — no need for HashMap as only x and y are involved.

📊 Dry Run Example:
Input: arr = [1, 2, 3, 4, 5, 6, 7, 8], x = 1, y = 7
freqX = 1, freqY = 1 → Output: min(1, 7) = 1

🕒 Time Complexity: O(n)
💾 Space Complexity: O(1)

⚠️ Edge Cases:
- If x == y, return x
- If one or both elements are missing, return the one with higher frequency or smaller one if equal

*/

public class MoreFrequentElement {

    public static int moreFrequent(int[] arr, int x, int y) {
        int freqX = 0, freqY = 0;

        for (int num : arr) {
            if (num == x) freqX++;
            if (num == y) freqY++;
        }

        if (freqX > freqY) return x;
        else if (freqY > freqX) return y;
        else return Math.min(x, y);
    }

    // Sample usage
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("More frequent: " + moreFrequent(arr1, 1, 7));  // Output: 1

        int[] arr2 = {7, 7, 3, 1, 1, 1};
        System.out.println("More frequent: " + moreFrequent(arr2, 1, 7));  // Output: 1

        int[] arr3 = {2, 4, 6, 8};
        System.out.println("More frequent: " + moreFrequent(arr3, 5, 9));  // Output: 5
    }
}
