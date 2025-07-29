/*
🟨 PROBLEM: Mean and Median of Array
🧮 Problem Name: Mean and Median of Array
🔗 Source: GFG
📂 Topic: Arrays / Sorting
⚙️ Difficulty: Easy


2️⃣ What is asked:
Given an array of positive integers, return:
- Floor of mean (average)
- Floor of median (middle value after sorting)

3️⃣ Approach:
- Mean = sum / length
- Median = sort → if even: floor of avg of 2 middle, if odd: middle element

4️⃣ Sample:
Input: [2, 8, 3, 4] → Output: Mean = 4, Median = 3

5️⃣ Notes:
- Watch for integer division
- Must sort before median

🧠 Follow-Ups:
Q: Can we get median without sorting? A: Use QuickSelect (O(n) avg)
*/

import java.util.Arrays;

public class MeanMedianOfArray {

    public int mean(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum / arr.length;
    }

    public int median(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 1)
            return arr[n / 2];
        else
            return (arr[n / 2 - 1] + arr[n / 2]) / 2;
    }
}
