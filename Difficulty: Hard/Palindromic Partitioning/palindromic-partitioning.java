import java.util.Arrays;

class Solution {
    /**
     * Calculates the minimum cuts needed for palindrome partitioning of the given string.
     *
     * @param s The input string.
     * @return The fewest cuts needed.
     */
    static int palPartition(String s) {
        int n = s.length();

        // isPalindrome[i][j] will be true if the substring s[i...j] is a palindrome.
        // This table helps in quickly checking if a substring is a palindrome.
        boolean[][] isPalindrome = new boolean[n][n];

        // dp[i] will store the minimum cuts needed for the prefix s[0...i-1].
        // The size is n+1 because dp[0] represents an empty string (0 cuts)
        // and dp[n] will represent the entire string.
        int[] dp = new int[n + 1];

        // --- Step 1: Precompute all palindrome substrings ---
        // This step fills the isPalindrome table.

        // All substrings of length 1 are palindromes.
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        // Check for substrings of length 2.
        // A substring s[i...i+1] is a palindrome if s[i] equals s[i+1].
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
            }
        }

        // Check for substrings of length 3 or more.
        // 'L' represents the current length of the substring being checked.
        for (int L = 3; L <= n; L++) {
            // 'i' is the starting index of the substring.
            // It goes from 0 up to n - L (inclusive), ensuring 'j' stays within bounds.
            for (int i = 0; i <= n - L; i++) {
                // 'j' is the ending index of the substring.
                int j = i + L - 1;

                // A substring s[i...j] is a palindrome if:
                // 1. The characters at the ends (s[i] and s[j]) are the same.
                // 2. The inner substring s[i+1...j-1] is also a palindrome.
                // We rely on previously computed values for smaller lengths.
                if (s.charAt(i) == s.charAt(j) && isPalindrome[i + 1][j - 1]) {
                    isPalindrome[i][j] = true;
                }
            }
        }

        // --- Step 2: Calculate minimum cuts using dynamic programming ---
        // This step fills the dp array to find the minimum cuts.

        // dp[0] is 0, as an empty string requires no cuts.
        dp[0] = 0;

        // Iterate from length 1 up to n (the entire string).
        // 'i' here represents the length of the prefix s[0...i-1] we are considering.
        for (int i = 1; i <= n; i++) {
            // Initialize dp[i] to the worst-case scenario: i-1 cuts.
            // For example, "abc" (length 3) might need "a|b|c", which is 2 cuts (3-1).
            dp[i] = i - 1;

            // Iterate through all possible starting points 'j' for the *last* palindrome substring
            // within the current prefix s[0...i-1].
            // The substring being checked is s[j...i-1].
            for (int j = 0; j < i; j++) {
                // If the substring s[j...i-1] is a palindrome:
                if (isPalindrome[j][i - 1]) {
                    if (j == 0) {
                        // If 'j' is 0, it means the entire prefix s[0...i-1] is a palindrome.
                        // In this case, no cuts are needed for this prefix.
                        dp[i] = 0;
                    } else {
                        // If s[j...i-1] is a palindrome and 'j' is not 0,
                        // it means we can make a cut before 'j' (at index j-1).
                        // The total cuts would be 1 (for this cut) + minimum cuts for the prefix s[0...j-1] (which is dp[j]).
                        // We take the minimum of the current dp[i] and this new possibility.
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }

        // The final result is dp[n], which contains the minimum cuts for the entire string 's'.
        return dp[n];
    }
}