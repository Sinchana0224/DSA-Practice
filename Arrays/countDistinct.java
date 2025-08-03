// ✅ Problem: Count Distinct Elements in an Array
// ✅ Level: Easy
// ✅ Time Complexity: O(n^2) – due to nested loops
// ✅ Space Complexity: O(1) – no extra data structures used

/*
🧠 Explanation:
For every element in the array, we check all previous elements to see if it has occurred before.
If not, we increment the count.
This approach avoids using HashSet and is useful when constraints restrict extra space.
*/

import java.util.Scanner;

public class countDistinctElements {
    
    public static int countDigits(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] == a[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }
        return count;
    }

    // 🚀 Main method to run input and test
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Number of distinct elements: " + countDigits(a, n));
    }
}

/*
📌 Sample Input:
7
1 2 2 3 4 4 5

📌 Output:
Number of distinct elements: 5

📌 Notes:
- Works without any inbuilt collections like HashSet.
- Avoids extra space, good for interview scenarios where space is a constraint.
*/


// ✅ Method: Using HashSet
// ✅ Time Complexity: O(n)
// ✅ Space Complexity: O(n)

/*
🧠 Explanation:
We use a HashSet because it stores only unique elements.
As we iterate through the array, we add elements to the HashSet.
At the end, the size of the HashSet is the count of distinct elements.
*/

import java.util.*;

public class countDistinctElements {
    public static int countDistinct(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }

    // 🚀 Sample test
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Number of distinct elements: " + countDistinct(arr));
    }
}

/*
📌 Sample Input:
arr = {1, 2, 2, 3, 4, 4, 5}

📌 Output:
Number of distinct elements: 5

📌 Notes:
- Use HashSet for O(1) average time complexity on inserts.
- Works for both sorted and unsorted arrays.
*/
