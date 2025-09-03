// User function Template for Java

class Solution {
    public ArrayList<Integer> uniqueId(int[] arr) {
        //  code here
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        return new ArrayList<>(set);
    }
}