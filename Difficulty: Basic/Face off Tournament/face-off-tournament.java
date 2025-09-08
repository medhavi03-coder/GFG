class Solution {
    public String winner(int[] arr, int m, int n) {
        // code here
        int count1=0;
        int count2=0;
        for(int i :arr){
            if(i%m==0){
                count1++;
            }
        }
        for(int i:arr){
            if(i%n==0){
                count2++;
            }
        }
        if(count1>count2){
            return "Ram";
        }
        else if(count2>count1){
            return "Rohan";
        }
        return "Both";
        
    }
}
