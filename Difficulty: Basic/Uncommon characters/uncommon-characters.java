// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        
        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();
        Set<Character> ans = new TreeSet<>();
        String res ="";
        
        
        for(char ch:s1.toCharArray()){
            set1.add(ch);
        }
        
        for(char ch:s2.toCharArray()){
            set2.add(ch);
        }
        
        
        
        for(char ch: set1){
            if(set2.contains(ch)){
                continue;
            }
            else{
                ans.add(ch);
            }
        }
        
        for(char ch: set2){
            if(set1.contains(ch)){
                continue;
            }
            else{
                ans.add(ch);
            }
        }
        
         for(char ch: ans){
             res += ch;
         }
         return res;
        
        
    }
}