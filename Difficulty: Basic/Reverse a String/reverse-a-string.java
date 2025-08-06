class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        char[] a = s.toCharArray();
        int left=0;
        int right=s.length()-1;
        for(int i=right;i>=0;i--){
            str.append(a[i]);
        }
        
        return str.toString();
    }
}