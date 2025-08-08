// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder a = new StringBuilder();
        for(char ch: s.toCharArray()) {
            if("aeiouAEIOU".indexOf(ch) == -1) {
                a.append(ch);
            }
        }
        
        return a.toString();
    }
}