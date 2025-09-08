// User function Template for Java

class Solution {
    public int maxPoint(int k, int[] arr1, int[] arr2) {
        // code
       int ans =0;
        for(int i =0; i<arr1.length;i++){
            int q = k/arr1[i];
            int s = q*arr2[i];
            ans = Math.max(ans,s);
        }
        return ans;
    }
}
