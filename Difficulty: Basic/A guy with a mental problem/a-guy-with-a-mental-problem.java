class Solution {
    public int minTime(int[] arr1, int[] arr2) {
        // code here
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr1.length;i+=2){
            sum1 = sum1+ arr1[i];
        }
        for(int j=1; j<arr2.length;j+=2){
            sum2 =sum2+ arr1[j];
        }
        for(int i=1;i<arr1.length;i+=2){
            sum1 = sum1+arr2[i];
        }
        for(int j=0; j<arr2.length;j+=2){
            sum2 = sum2+ arr2[j];
        }
        int sum = Math.min(sum1,sum2);
        return sum;
    }
}
