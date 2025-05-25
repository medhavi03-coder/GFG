import java.util.HashSet;

class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int n = arr.length;
        HashSet<Integer> squares = new HashSet<>();

        // Store squares of all elements
        for (int i = 0; i < n; i++) {
            squares.add(arr[i] * arr[i]);
        }

        // Check for every pair (i, j) if (a^2 + b^2) exists
        for (int i = 0; i < n; i++) {
            int a2 = arr[i] * arr[i];
            for (int j = i + 1; j < n; j++) {
                int b2 = arr[j] * arr[j];
                if (squares.contains(a2 + b2)) {
                    return true;
                }
            }
        }

        return false;
    }
}
