class Solution {

    static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1; // Initialize with -1, indicating no floor found yet

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                // If arr[mid] is equal to x, it's a potential floor.
                // We want the last occurrence, so we store this index and
                // continue searching in the right half to find a potentially
                // larger index with the same value.
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                // If arr[mid] is less than x, it's a potential floor.
                // Store this index and try to find a larger element (but still <= x)
                // in the right half.
                ans = mid;
                low = mid + 1;
            } else { // arr[mid] > x
                // If arr[mid] is greater than x, it cannot be the floor.
                // We need to look in the left half.
                high = mid - 1;
            }
        }
        return ans;
    }
}