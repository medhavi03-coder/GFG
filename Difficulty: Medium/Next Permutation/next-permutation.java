class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        // Step 1: Find the longest non-increasing suffix
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;

        if (i >= 0) {
            // Step 2: Find the rightmost successor to pivot in the suffix
            int j = n - 1;
            while (arr[j] <= arr[i]) j--;

            // Step 3: Swap the pivot with successor
            swap(arr, i, j);
        }

        // Step 4: Reverse the suffix
        reverse(arr, i + 1, n - 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}