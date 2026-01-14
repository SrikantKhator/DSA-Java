// Problem: Find the element that appears once
// All other elements appear exactly twice
// Approach: XOR cancels duplicate elements

public class SingleElement {

    public static int findSingleElement(int[] arr) {
        int xor = 0;

        for (int num : arr) {
            xor ^= num;
        }

        return xor;
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(1)
*/
