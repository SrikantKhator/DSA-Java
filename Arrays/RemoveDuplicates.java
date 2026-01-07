/*
Problem: Remove Duplicate Elements from a Sorted Array

Approach:
- Use two pointers
- 'index' tracks position of last unique element
- Shift unique elements forward

Assumption:
- Input array is sorted

Time Complexity: O(N)
Space Complexity: O(1)
*/

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                arr[index + 1] = arr[i];
                index++;
            }
        }
        return index + 1; // number of unique elements
    }
}

