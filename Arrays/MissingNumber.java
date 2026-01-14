// Problem: Find the missing number in the range [1, N]
// Approach: Use sum formula
// ExpectedSum = N * (N + 1) / 2
// Missing = ExpectedSum - ActualSum

public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(1)
*/
