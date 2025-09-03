// User function Template for Java

class Solution {

    public int shortestUnorderedSubarray(int arr[]) {
        int count=0;
        for(int i =0; i <arr.length-2;i++){
            if((arr[i]<arr[i+1] && arr[i+1]>arr[i+2]) || (arr[i]>arr[i+1] && arr[i+1]<arr[i+2] )){
                count=(i+2)-i+1;
            }
        }
        return count;
    }
}