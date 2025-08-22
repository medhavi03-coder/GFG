class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer>st = new Stack<>();
        
        ArrayList<Integer>res = new ArrayList<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
        }
        st.push(arr[i]);
    }
   for(int i=0;i<n;i++){
       res.add(ans[i]);
   }
    return res;
}
}