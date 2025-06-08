class Solution {
    public boolean isSumString(String s) {
        int n = s.length();
        
        // Try all possible combinations of first and second number
        for (int i = 1; i < n; i++) {
            for (int j = 1; i + j < n; j++) {
                String first = s.substring(0, i);
                String second = s.substring(i, i + j);
                
                // Skip if any has leading zero (but not '0' itself)
                if ((first.length() > 1 && first.charAt(0) == '0') || 
                    (second.length() > 1 && second.charAt(0) == '0')) {
                    continue;
                }

                if (isValidSequence(first, second, s.substring(i + j))) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isValidSequence(String first, String second, String remaining) {
        String sum = addStrings(first, second);
        
        if (!remaining.startsWith(sum)) return false;

        if (remaining.equals(sum)) return true;

        return isValidSequence(second, sum, remaining.substring(sum.length()));
    }

    // Helper to add large numbers represented as strings
    private String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            int sum = digit1 + digit2 + carry;

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}
