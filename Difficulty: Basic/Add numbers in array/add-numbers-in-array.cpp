//User function Template for C++

class Solution{
    public:
    long long get_Sum(int n,vector<int>&input)
    {
        //your code here
        long long sum=0;
        for(int i:input){
            sum += i;
        }
        return sum;
    }
};
