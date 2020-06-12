class Solution {
    public int change(int amt, int[] coins) {
        int dp[] = new int[amt + 1]; 
          dp[0] = 1;
        for(int coin : coins){ 
            for(int i = coin; i <= amt; i++){
                dp[i] += dp[i - coin];
            } 
        }  
        return dp[amt];  
        
    }
}
