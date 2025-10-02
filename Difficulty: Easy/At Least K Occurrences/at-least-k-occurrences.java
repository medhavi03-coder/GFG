class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i)==k){
                return i;
            }
        }
        return -1;
    }
}