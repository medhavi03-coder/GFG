class Sol {
    int isPossible(String S) {
        // your code here
        int count=0;
        Map<Character, Integer>map=new HashMap<>();
        for(char ch : S.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int f:map.values()){
        if(f % 2 !=0){
            count++;
        }}
        if(count>1)
        return 0;
        
        return 1;
    }
}