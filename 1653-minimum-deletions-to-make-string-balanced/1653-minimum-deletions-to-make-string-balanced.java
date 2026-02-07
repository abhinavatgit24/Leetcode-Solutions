class Solution {
    Integer [][]dp;
    public int helper(String s,int i,boolean isB){
        if(i==s.length()){
            return 0;
        }
        if(dp[i][isB?1:0]!=null){
            return dp[i][isB?1:0];
        }
        if(s.charAt(i)=='b'){
            if(isB){
                return dp[i][isB?1:0]= 1+helper(s,i+1,true);
            }
            else{
                return dp[i][isB?1:0]=Math.max(1+helper(s,i+1,true),helper(s,i+1,false));
            }
            
        }
        else{
            if(isB){
                return dp[i][isB?1:0]=helper(s,i+1,true);
            }
            else{
                return dp[i][isB?1:0]=1+helper(s,i+1,false);
            }
        }
    }
    public int minimumDeletions(String s) {
        dp=new Integer[s.length()][2];
        int keep=helper(s,0,false);  
        return s.length()-keep;
    }
}