class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int l =0;
        int ans=-1;
        int r = arr.length-1;
        while(l<=r){
                int mid=(l+r)/2;
            if(arr[mid]==k){
                ans =mid;
                r=mid-1;
            }
            if(k>arr[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
        
    }
}