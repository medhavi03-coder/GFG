/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i: b){
            arr.add(i);
        }
        for(int i=0;i<a.length;i++){
            if(!arr.contains(a[i])){
                return i;
            }
        }
        return -1;
        
    }
}