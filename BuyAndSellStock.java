public class BuyAndSellStock{

    public static int buyandsellstock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){ //Profit
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; //Today's Profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,2,6,4};
        System.out.println(buyandsellstock(prices));
    }
}