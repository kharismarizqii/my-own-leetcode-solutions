package leetcode

class CountPrimes {
    fun countPrimes(n: Int): Int {
        var count = 0
        for(i in 1 until n){
            if(isPrime(i)) count++
        }
        return count
    }

    private fun isPrime(n: Int): Boolean{
        if(n<=1) return false

        var i = 2
        while(i*i <= n){
            if(n%i == 0) return false
            i++
        }
        return true
    }
}