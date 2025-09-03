class Solution {
    public int maxPerimeter(int[] arr) {
        // code here
        int p=-1;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>2;i--){
            if(arr[arr.length-1]>(arr[arr.length-2]+arr[arr.length-3])){
                continue;
            }
            else{
                p=arr[arr.length-1]+arr[arr.length-2]+arr[arr.length-3];
            }
        }
        return p;
    }
}