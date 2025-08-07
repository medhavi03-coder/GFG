
class Solution {
    public String longest(List<String> arr) {
        // code here
        String longest = arr.get(0);
        for(int i =1;i<arr.size();i++){
            String curr = arr.get(i);
            if(longest.length() < curr.length()) {
                longest = curr;
    }
}
return longest;
}}
