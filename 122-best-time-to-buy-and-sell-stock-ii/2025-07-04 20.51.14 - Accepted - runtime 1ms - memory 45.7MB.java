class Solution {
    public int maxProfit(int[] prices) {
        int max=0,sum=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]-sum<0)
            sum=prices[i];
            else{
                max+= prices[i]-sum;
                sum=prices[i];
            }
        }
        return max;
    }
}