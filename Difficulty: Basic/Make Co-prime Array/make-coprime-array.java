class Solution {
    // code here
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public int countCoPrime(int[] arr) {
        int count=0;
        for(int i =1; i<arr.length;i++){
            if(gcd(arr[i],arr[i-1]) !=1){
                count++;
            }
        }
        return count;
    }
}