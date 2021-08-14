package leetcode

class UglyNumber {
    fun isUgly(n: Int): Boolean {
        if(n == 0) return false
        if(n == 1) return true
        var newN = n
        while(newN%2 == 0){
            newN/=2
        }

        while(newN%3 == 0){
            newN/=3
        }

        while(newN%5 == 0){
            newN/=5
        }

        return newN == 1
    }
}