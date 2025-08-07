class Solution {
    public static String concatenatedString(String s1, String s2) {
        // code here
        String ans = "";
        HashSet<Character> h1 = new HashSet<>();
        HashSet<Character> h2 = new HashSet<>();


        for (char ch : s1.toCharArray()) {
            h1.add(ch);
        }
        for (char ch : s2.toCharArray()) {
            h2.add(ch);
        }
        
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (h2.contains(ch)) {

            } else {
                ans += ch;
            }
        }
        
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (h1.contains(ch)) {

            } else {
                ans += ch;
            }
        }

        
        if (ans.isEmpty()) 
            return "-1";
        return ans;
        }
    }

