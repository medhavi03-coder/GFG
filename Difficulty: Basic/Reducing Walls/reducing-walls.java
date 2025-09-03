// User function Template for Java
class Solution {
    public int reducingWalls(int[] arr, int k) {
        // code
        int count=0;
        for(int i:arr){
            if(i>k){
                int step=i;
                while(step>k){
                    count++;
                    step = step-k;
                }
            }
        }
        return count;
    }
}