package leetcode

class PowerOfThree {
    fun isPowerOfThree(n: Int): Boolean {
        var number = n
        if (n <= 0) return false
        while (number > 1){ 
            if (number % 3 != 0) return false
            else number = number / 3
        }
        return true
    }
}
