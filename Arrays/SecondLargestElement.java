/*
Problem: Finding Second Largest Element in an Array

Approach:
- Maintain two variables: largest and secondLargest
- Update them in a single traversal

Time Complexity: O(N)
Space Complexity: O(1)
*/

public class SecondLargestElement {

    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
