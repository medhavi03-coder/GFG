class Solution {
    public List<Integer> findEvenOccurrences(int[] arr) {
        // code here
        LinkedHashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val%2==0){
            list.add(key);
        }
    }
    if(list.size()==0){
        list.add(-1);
    }
    return list;
}
}
