import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Finds all common elements in three sorted arrays (non-decreasing order).
     * The output list will also be in non-decreasing order and will not contain duplicates.
     * If no common elements are found, the method returns a list containing only -1.
     *
     * @param arr1 The first sorted integer array.
     * @param arr2 The second sorted integer array.
     * @param arr3 The third sorted integer array.
     * @return A List of common elements, or [-1] if no common elements are found.
     */
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        List<Integer> result = new ArrayList<>(); // List to store the common elements

        // Initialize three pointers, one for each array
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for arr3

        // Iterate while all pointers are within their respective array bounds
        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {

            // Case 1: All three elements at the current pointers are equal
            // This means we have found a common element.
            if (arr1.get(i).equals(arr2.get(j)) && arr2.get(j).equals(arr3.get(k))) {
                // Add the common element to the result list.
                // We check if the result list is empty or if the current common element
                // is different from the last element added to 'result'.
                // This ensures no duplicates in the output list.
                if (result.isEmpty() || !result.get(result.size() - 1).equals(arr1.get(i))) {
                    result.add(arr1.get(i));
                }
                
                // Advance all three pointers, as this common element has been processed.
                i++;
                j++;
                k++;
            }
            // Case 2: The element in arr1 is the smallest among the three.
            // This means arr1.get(i) cannot be a common element with arr2.get(j) and arr3.get(k).
            // So, we advance the pointer for arr1 to look for a larger value.
            else if (arr1.get(i) < arr2.get(j)) {
                i++;
            }
            // Case 3: The element in arr2 is the smallest among the three.
            // (This condition is checked if arr1.get(i) was not the smallest).
            // Advance the pointer for arr2.
            else if (arr2.get(j) < arr3.get(k)) {
                j++;
            }
            // Case 4: The element in arr3 is the smallest among the three.
            // (This is the remaining case if arr1.get(i) and arr2.get(j) were not the smallest).
            // Advance the pointer for arr3.
            else { // arr3.get(k) is the smallest
                k++;
            }
        }

        // After the loop, if the 'result' list is empty, it means no common elements were found.
        // As per the problem's example output, return a list containing -1 in this case.
        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}
