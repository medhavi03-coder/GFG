// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        String[] arr = sentence.split(" ");
        long max=-1;
        for(String s: arr){
            if(s.matches("\\d+")){
                if(!s.contains("9")){
                    long num = Long.parseLong(s);
                    if(num>max){
                        max=num;
                    }
                }
            }
        }
        return max;
    }
}