import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Determines whether array b[] is a subset of array a[].
     * An array b[] is a subset of a[] if all elements of b[] are present in a[].
     * If there are duplicate elements, the count of each element in b[]
     * must be less than or equal to its count in a[].
     *
     * @param a The main array.
     * @param b The array to check if it's a subset.
     * @return true if b[] is a subset of a[], false otherwise.
     */
    public boolean isSubset(int a[], int b[]) {
        // Create a HashMap to store the frequency of each element in array 'a'.
        // Key: element value, Value: frequency count
        Map<Integer, Integer> frequencyMapA = new HashMap<>();

        // Populate the frequency map for array 'a'
        for (int num : a) {
            frequencyMapA.put(num, frequencyMapA.getOrDefault(num, 0) + 1);
        }

        // Iterate through array 'b' and check if its elements are present in 'a'
        // with sufficient frequency.
        for (int num : b) {
            // If the element from 'b' is not found in 'frequencyMapA'
            // OR if its count in 'a' is 0 (meaning all occurrences in 'a' have been "used up")
            if (!frequencyMapA.containsKey(num) || frequencyMapA.get(num) == 0) {
                return false; // 'b' cannot be a subset of 'a'
            } else {
                // If the element is found and its count is greater than 0,
                // decrement its count in the map as we've "used" one occurrence.
                frequencyMapA.put(num, frequencyMapA.get(num) - 1);
            }
        }

        // If we've iterated through all elements of 'b' without returning false,
        // it means all elements of 'b' are present in 'a' with sufficient counts.
        return true;
    }
}
