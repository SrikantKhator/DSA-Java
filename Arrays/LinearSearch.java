/*
Problem: Linear Search

Approach:
- Traverse array
- Compare each element with target
- Return index if found

Time Complexity: O(N)
Space Complexity: O(1)
*/

public class LinearSearch {

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // target not found
    }
}
