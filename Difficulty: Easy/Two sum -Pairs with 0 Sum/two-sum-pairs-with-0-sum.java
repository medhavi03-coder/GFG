// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>>res = new ArrayList<>();
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]>0){
                j--;
            }
            else if(arr[i]+arr[j]<0){
                i++;
            }
            else{
                res.add(new ArrayList<Integer>(List.of(arr[i],arr[j])));
                i++;
                j--;
                while(i<j && arr[i]==arr[i-1]){
                    i++;
                }
                while(i<j && arr[j]==arr[j+1]){
                    j--;
                }
            }
        }
        
        return res;
    }
}
