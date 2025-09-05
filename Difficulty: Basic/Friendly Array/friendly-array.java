class Solution {
    public int calculateFriendliness(int[] arr) {
        // code here
        int sum =Math.abs(arr[0]-arr[arr.length-1]);
        for(int i =0; i <arr.length-1;i++){
            sum += Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
}
