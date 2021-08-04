package leetcode

class HappyNumber {
    fun isHappy(n: Int): Boolean {
        var slow = n
        var fast = n
        do {
            slow = digitSquareSum(slow)
            fast = digitSquareSum(fast)
            fast = digitSquareSum(fast)
        }while(slow!=fast)
        
        return slow == 1
    }

    fun digitSquareSum(num: Int): Int{
        var n = num
        var sum = 0
        var tmp = 0
        while(n!=0){
            tmp = n%10
            sum += tmp*tmp
            n/=10
        }
        return sum
    }
}
