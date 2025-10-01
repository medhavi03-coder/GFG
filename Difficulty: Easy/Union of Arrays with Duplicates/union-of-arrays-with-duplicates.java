class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i:a){
                set.add(i);
            }
        for(int j:b){
                set.add(j);
            }
        return new ArrayList<>(set);
    }}