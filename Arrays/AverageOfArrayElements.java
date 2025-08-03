// ✅ Problem: Find Average of Elements in Array
// 📌 Description:
// Given an array of integers, calculate and return the average of all its elements.
//
// 🔢 Sample Input:
// 5
// 2 4 6 8 10
//
// 🎯 Sample Output:
// 6.0
//
// 🧠 Approach:
// 1. Calculate sum of all elements.
// 2. Divide the sum by the total number of elements to get the average.
//
// ⏱️ Time Complexity: O(n)
// 🧠 Space Complexity: O(1)

import java.util.Scanner;

public class averageOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 🔹 Input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 🔹 Calculate sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // 🔹 Calculate average
        double average = (double) sum / n;

        // 🖨️ Print average
        System.out.println(average);
    }
}
