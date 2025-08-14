// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        String ans ="";
        int i=0;
        while(i<S.length()){
            ans += S.charAt(i);
            i=i+2;
        }
        return ans;
    }
}