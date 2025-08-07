// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        String ans ="";
        Set<Character> s1 = new HashSet<>();
        
        for(char ch:str2.toCharArray()){
            s1.add(ch);
        }
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(s1.contains(ch)){
                
            }
            else{
                ans += ch;
            }
        }
        return ans;
    }
}