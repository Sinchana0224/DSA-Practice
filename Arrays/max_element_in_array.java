// ✅ Problem: Find the Maximum Element in an Array
// 📌 Description:
// Given an array of integers, find and return the maximum element.
// 🔢 Sample Input:
// 5 2 8 1 9 4
// 🎯 Sample Output:
// 9
// 🧠 Approach:
// 1. Initialize max to Integer.MIN_VALUE
// 2. Traverse the array and update max if a larger element is found.
// ⏱️ Time Complexity: O(n)
// 🧠 Space Complexity: O(1)

import java.util.Scanner;

public class findMaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 🔹 Input the array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 🔹 Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 🔹 Initialize max with minimum possible value
        int max = Integer.MIN_VALUE;

        // 🔍 Traverse to find max
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // 🖨️ Print result
        System.out.println(max);
    }
}
