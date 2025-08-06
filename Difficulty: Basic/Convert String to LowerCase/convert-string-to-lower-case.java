// User function template for Java

class Solution {
    static String toLower(String s) {
        // code here
        
        StringBuilder str= new StringBuilder();
        for(int i =0; i <s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch<='Z'){
                str.append((char)((int)ch+32));
    }
    else{
        str.append(ch);
        }
        }
    return str.toString();
}
}
