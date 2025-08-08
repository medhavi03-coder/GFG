// User function Template for Java

class Solution {
    String modify(String s) {
        char[] a = s.toCharArray();
        int left=0;
        int right = s.length()-1;
        while(left<right){
            while(left < right && !"aeiou".contains(a[left]+"")){
                left++;
            }
            while(left<right && !"aeiou".contains(a[right]+"")){
                right--;
            }
            if(left<right){
                char t = a[left];
                a[left]=a[right];
                a[right] = t;
                left++;
                right--;
            }
        }
        return new String(a);
    }
}