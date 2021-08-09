package leetcode

class CoinChange2 {
    fun change(amount: Int, coins: IntArray): Int{
        if(coins.size == 0) return if(amount == 0) 1 else 0
        val dp = Array(coins.size+1){IntArray(amount+1){
            -1
        } }
        return calculate(amount, coins, 0, dp)
    }

    fun calculate(amount: Int, coins: IntArray, index: Int, dp: Array<IntArray>): Int {
        if(index >= coins.size) return 0
        if(amount == 0) return 1
        if (amount < 0) return 0
        if(dp[index][amount]!=-1) return dp[index][amount]
        val ans = calculate(amount-coins[index], coins, index, dp) + calculate(amount,coins,index+1, dp)
        dp[index][amount] = ans
        return ans
    }
}