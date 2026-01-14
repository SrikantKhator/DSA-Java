// Problem: Find maximum number of consecutive 1s in a binary array
// Approach: Traverse and maintain count of current streak

public class MaximumConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int count = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(1)
*/
