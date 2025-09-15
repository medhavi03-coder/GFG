class Solution {
    public int findMaxOddSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        int sum=0;
        int maxNeg=0;
        int minPos=0;
        int sum1 = Integer.MIN_VALUE;
        int sum2 = Integer.MIN_VALUE;
        for(int i =arr.length-1; i>=0;i--){
            if(arr[i]>0){
                sum += arr[i];
            }}
        if(sum%2 != 0){
            return sum;
        }
        for(int i =arr.length-1; i >0;i--){
            if(arr[i]<0 && arr[i]%2 != 0){
                maxNeg = arr[i];
                break;
            }
        }
         for(int i = 0; i<arr.length;i++){
            if(arr[i]>0 && arr[i]%2 != 0){
                minPos = arr[i];
                break;
            }
        }
        if(minPos != 0){
            sum1 = sum - minPos;
        }
        if(maxNeg != 0){
            sum2 = sum + maxNeg;
        }
        
        return Math.max(sum1,sum2);
    }
}
