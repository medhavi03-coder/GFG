class Solution {
     public void fibo(ArrayList<Long> fib,long max){
                long a =0;
                long b =1;
                fib.add(a);
                fib.add(b);
                while(a+b<=max){
                    long c = a+b;
                    fib.add(c);
                    a=b;
                    b=c;
                }
        }
    public int countFibonacciNumbers(long[] arr) {
        // code here
        ArrayList<Long> fib = new ArrayList<>();
        long max =0;
        int count=0;
        for(int i=0; i <arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        fibo(fib,max);
        for(long i:arr){
            if(fib.contains(i)){
                count++;
            }
        }
        return count;
    }
       
    }

