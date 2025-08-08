// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        StringBuilder res = new StringBuilder(s.length());
        boolean capNext = true;
        for(char ch:s.toCharArray()){
            if(ch== ' '){
                res.append(ch);
                capNext=true;
            }
            else if(capNext){
                    if(ch >='a' && ch<='z'){
                        res.append((char)(ch-'a'+'A'));
                    }
                    else{
                        res.append(ch);
                    }
                    capNext = false;
                } else{
                    res.append(ch);
                }
            }
            return res.toString();
        }
    }
