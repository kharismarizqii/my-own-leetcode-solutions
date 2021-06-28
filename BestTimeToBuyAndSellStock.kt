package leetcode

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var minprice = 10000
        var current = 0
        for(i in 0 until prices.size){
            if(prices[i] < minprice){
                minprice = prices[i]
            } else if(prices[i] - minprice > current){
                current = prices[i] - minprice
            }
        }
        return current
    }
}