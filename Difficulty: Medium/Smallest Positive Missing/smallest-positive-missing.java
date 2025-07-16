class Solution {
    /**
     * Finds the smallest positive number missing from the given integer array.
     * The array can contain negative integers and duplicates.
     *
     * This solution uses an in-place modification of the array to mark visited positive numbers,
     * achieving O(N) time complexity and O(1) extra space.
     *
     * @param arr The input integer array.
     * @return The smallest positive integer (starting from 1) missing from the array.
     */
    public int missingNumber(int[] arr) {
        int n = arr.length;

        // Step 1: Segregate positive numbers to the beginning of the array.
        // All non-positive numbers (0 or negative) are moved to the end.
        // 'j' will track the boundary between positive and non-positive numbers.
        int j = 0; // Pointer for the next position for a positive number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // If the current element is positive, swap it with arr[j]
                // and increment j.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // Now, the subarray arr[0...j-1] contains all positive numbers.
        // 'j' represents the count of positive numbers in the array.
        // We only need to consider this part of the array for finding the missing positive.
        int positiveCount = j;

        // Step 2: Use the array itself to mark visited numbers.
        // Iterate through the positive part of the array (arr[0...positiveCount-1]).
        // For each number 'x' encountered, if 'x' is within the range [1, positiveCount],
        // mark the element at index 'x-1' as negative.
        // The absolute value is used because an element might already be negative
        // due to a previous marking.
        for (int i = 0; i < positiveCount; i++) {
            int val = Math.abs(arr[i]); // Get the absolute value of the number

            // If 'val' is a valid index (1 to positiveCount), mark its corresponding
            // position by making the element at that index negative.
            if (val >= 1 && val <= positiveCount) {
                // We use Math.abs(arr[val - 1]) before negating to ensure it's not already
                // a negative number that we marked earlier, which would cause double negation
                // and make it positive again.
                arr[val - 1] = -Math.abs(arr[val - 1]);
            }
        }

        // Step 3: Find the first positive index.
        // Iterate through the positive part of the array again.
        // The first index 'i' where arr[i] is still positive indicates that
        // the number (i + 1) was never present in the original positive numbers.
        for (int i = 0; i < positiveCount; i++) {
            if (arr[i] > 0) {
                return i + 1; // This is the smallest missing positive number.
            }
        }

        // Step 4: If all numbers from 1 to 'positiveCount' are present,
        // then the smallest missing positive number is 'positiveCount + 1'.
        return positiveCount + 1;
    }
}
