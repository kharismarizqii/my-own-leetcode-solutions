package leetcode

class ArrangingCoins {
    fun arrangeCoins(n: Int): Int {
        var coin = n
        var count = 1
        while(coin>=0){
            coin-=count
            count++
        }
        return count-2
    }
}