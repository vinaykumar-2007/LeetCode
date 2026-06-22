class Solution {
    public int fib(int n) {
        int sum =0;
        int a =0;
        int b = 1;
        for(int i=0;i<n;i++){
            sum +=a;
            int c = a+b;
            a =b;
            b=c;
        }
        return a;
    }
}