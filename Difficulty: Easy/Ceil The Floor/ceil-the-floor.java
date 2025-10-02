// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int n = arr.length;
        int min=-1;
        int curMin=-1;
        int max = -1;
        int curMax = -1;
        int[] ans = new int[2];
        // for(int i=0;i<n;i++){
        //     if(arr[i]<min){
        //         min=arr[i];
        //     }
        // }
        for(int i=0; i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        
        for(int i=0;i<n;i++){
            if(arr[i]>=min && arr[i]<=x){
                min=arr[i];
                
            }
        }
         for(int i=0;i<n;i++){
            if(arr[i]<=max && arr[i]>=x){
                max=arr[i];
                
            }
        }
        
        if(max < x) {
            max = -1;
        }
        ans[0]= min;
        ans[1]= max;
        
        return ans;
    }
}
