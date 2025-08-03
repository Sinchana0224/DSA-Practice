/*
  📝 Problem: Check if Array is Sorted (Non-Decreasing Order)

  🔍 Description:
  Given an array of integers, check whether the array is sorted in non-decreasing order.
  (Each element is less than or equal to the next one.)

  📥 Example 1:
      Input: arr = [1, 2, 2, 4, 5]
      Output: true

  📥 Example 2:
      Input: arr = [10, 5, 8]
      Output: false

  🧠 Approach:
  - Traverse the array from start to second-last element.
  - For each index i, check if arr[i] > arr[i+1].
  - If yes, the array is not sorted → return false.
  - If no such pair exists, return true.

  ⏱️ Time Complexity: O(n) → One pass through the array
  🗂️ Space Complexity: O(1) → No extra space used
*/

public class CheckSortedArray {

    // ✅ Function to check if the array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // ❌ Order violated
            }
        }
        return true; // ✅ All elements in correct order
    }

    public static void main(String[] args) {

        // 🔹 Test Case 1: Sorted array
        int[] arr1 = {1, 2, 2, 4, 5};
        System.out.println("Is arr1 sorted? " + isSorted(arr1));  // true

        // 🔹 Test Case 2: Unsorted array
        int[] arr2 = {10, 5, 8};
        System.out.println("Is arr2 sorted? " + isSorted(arr2));  // false
    }
}
