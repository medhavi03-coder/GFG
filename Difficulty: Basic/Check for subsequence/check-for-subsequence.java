// User function Template for Java

class Solution {
    boolean isSubSequence(String A, String B) {
        
        int indexA=0;
        int indexB = 0;
        while(indexA < A.length() && indexB < B.length()){
            if(A.charAt(indexA)==B.charAt(indexB)){
                indexA++;
            }
            indexB++;
        }
              return indexA == A.length();
    }
}