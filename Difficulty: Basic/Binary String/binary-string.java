class Solution {
    public int binarySubstring(String s) {
        // code here
        int count=0;
        for(int i =0; i<s.length();i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        count = (count*(count-1))/2;
       return count;
    }
}