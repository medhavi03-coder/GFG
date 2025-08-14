// User function Template for Java

class Sol {
    int getCount(String S, int N) {
        // your code here
        int count=0;
        HashMap<Character, Integer> map = new HashMap<>();
        // for(char ch:S.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }
        
        for(int i=0; i<S.length(); ) {
            char curr = S.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0)+1);
            
            int j=i+1;
            while(j < S.length() && S.charAt(j) == curr) {
                j++;
            }
            i=j;
        }
        for(int frequency :map.values()){
            if(frequency == N){
                count++;
            }
        }
        return count;
    }
}