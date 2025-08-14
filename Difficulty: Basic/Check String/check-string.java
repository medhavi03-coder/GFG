// User function Template for Java

class Sol {
    Boolean check(String s) {
        // your code here
        int i =1;
        while(i<s.length()){
            if(s.charAt(i-1)!=s.charAt(i)){
                return false; 
            }
            i++;
           
        }
         return true;
    }
}