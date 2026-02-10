class Solution {
    public int fib(int n) {
        if (n<=1) return n ;

        int last = fib(n-1);
        int slast = fib(n-2);

        int ans = last+slast ;

        return ans;
    }
        
    
}