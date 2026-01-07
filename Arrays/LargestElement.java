/*
Problem: Finding Largest Element in an Array

Approach:
- Initialize largest as first element
- Traverse the array
- Update largest if current element is greater

Time Complexity: O(N)
Space Complexity: O(1)
*/

public class LargestElement {

    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
