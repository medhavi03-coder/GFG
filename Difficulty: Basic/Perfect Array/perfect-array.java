class Solution {
    public boolean isPerfect(int[] arr) {
        // code here
        if((arr[0]>=arr[1]) || (arr[arr.length-1]>arr[arr.length-2])){
            return false;
        }
        int count1=-1;
        int count2=-1;
        for(int i =0; i <arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                count1=1;
            }
            else if(arr[i]==arr[i+1]){
                count1=0;
                break;
            }
            else{
                count1=-1;
                break;
            }
        }
        
        for(int i =arr.length-1; i >0;i--){
            if(arr[i]<arr[i-1]){
                count2=1;
            }
            else if(arr[i]==arr[i-1]){
                count2=0;
                break;
            }
            else{
                count2=-1;
                break;
            }
        }
        
        if(count1==-1 || count2==-1) return false;
        return true;
    }
}
