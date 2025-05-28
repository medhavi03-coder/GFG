import java.util.*;

class Solution {
    public boolean ValidCorner(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        // Use a HashSet to record column pairs we've seen before in previous rows
        HashSet<String> set = new HashSet<>();

        // Traverse all rows
        for (int i = 0; i < n; i++) {
            // Find all pairs of columns with 1s in the current row
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    for (int k = j + 1; k < m; k++) {
                        if (mat[i][k] == 1) {
                            String key = j + "," + k;
                            // If this pair has been seen before → rectangle exists
                            if (set.contains(key)) {
                                return true;
                            }
                            // Else, mark this pair as seen for future rows
                            set.add(key);
                        }
                    }
                }
            }
        }

        return false;
    }
}
