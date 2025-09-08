
class Solution {
    public static int specialIntegers(int n, int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int count=0;
        for(int s:set){
        if(set.contains(s) && set.contains(s-1) && set.contains(s+1)){
            count++;
        }
        }
        return count;
    }
}
        
