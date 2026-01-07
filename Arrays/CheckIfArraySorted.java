/*
Problem: Check if Array is Sorted in Non-Decreasing Order

Approach:
- Traverse from index 1
- Compare current element with previous
- If any element is smaller than previous, array is not sorted

Time Complexity: O(N)
Space Complexity: O(1)
*/

public class CheckIfArraySorted {

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

