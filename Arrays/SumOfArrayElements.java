// ✅ Problem: Sum of Array Elements
// 📌 Description:
// Given an array of integers, find and return the sum of all its elements.
// 🔢 Sample Input:
// 5 2 4 6 8 10
// 🎯 Sample Output:
// 30
// 🧠 Approach:
// 1. Initialize a variable `sum` to 0
// 2. Traverse the array and keep adding each element to `sum`
// ⏱️ Time Complexity: O(n)
// 🧠 Space Complexity: O(1)

import java.util.Scanner;

public class sumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Input the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 🔹 Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 🔹 Initialize sum
        int sum = 0;

        // 🔍 Calculate sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // 🖨️ Print the sum
        System.out.println(sum);
    }
}
