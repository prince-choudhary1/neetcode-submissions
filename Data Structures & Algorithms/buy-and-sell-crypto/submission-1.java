class Solution {
    public int maxProfit(int[] prices) {


      //optimal approach
      int left=0;
      int right=1;
      int maxProfit=0;
      while(right<prices.length){


       if(prices[left]<prices[right]){
       int profit=prices[right]-prices[left];
        maxProfit=Math.max(profit,maxProfit);
       }
       else{
        left=right;       
        }
       right++;
      }
      
      return maxProfit;
/*
brute force approach
     int maxProfit=0;
      for(int i=0;i<prices.length;i++){

        for(int j=i+1;j<prices.length;j++){

          int profit =prices[j]-prices[i];
          maxProfit=Math.max(maxProfit,profit);
        }
      }
      return maxProfit;
        */
    }
}
