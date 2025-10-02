class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int minX=-1;
        int minY =-1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                minX = i;
                if(minY != -1){
                    min = Math.min(min, Math.abs((minY)-(minX)));
                }
            }
            if(arr[i]==y){
                minY=i;
                if(minX != -1){
                    min = Math.min(min,Math.abs((minY)-(minX)));
                }
            }
        }
        return (minX == -1 || minY ==-1)? -1 :min;
    }
}