class Solution {
    public int maxProfit(int[] prices) {
      int MaxP = 0;
      int MinBuy = prices[0];

      for(int sell:prices) {
        MaxP = Math.max(MaxP, sell - MinBuy);
        MinBuy = Math.min(MinBuy, sell);
      }
      return MaxP; 
    }
}