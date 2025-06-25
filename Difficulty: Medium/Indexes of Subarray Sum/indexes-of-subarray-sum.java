import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, sum = 0;

        while (j < arr.length) {
            sum += arr[j];

            // Shrink the window from left if sum exceeds target
            while (sum > target && i <= j) {
                sum -= arr[i];
                i++;
            }

            if (sum == target) {
                // Found the subarray
                result.add(i + 1); // 1-based index
                result.add(j + 1);
                return result;
            }

            j++;
        }

        // If no subarray found
        result.add(-1);
        return result;
    }
}
