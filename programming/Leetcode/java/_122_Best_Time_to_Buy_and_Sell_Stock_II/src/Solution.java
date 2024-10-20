class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int min = 0;
        int max = 1;
        int value = 0;
        int result = 0;
        for (max = 1; max < prices.length; max++) {
            if (prices[max] > prices[min]) {
                if (value < Math.max(value, prices[max] - prices[min])) {
                    value = Math.max(value, prices[max] - prices[min]);
                    result = result + value;
                    value=0;
                    min=min+1;
                }
            } else {
                min = max;
            }
        }
        return result;
    }
}