package leetcode

import java.util.*

class PerfectNumber {
    fun checkPerfectNumber(num: Int): Boolean {
        val stackDivisor: Stack<Int> = getStackDivisor(num)
        var result = 0
        for (i in 0 until stackDivisor.size){
            println(stackDivisor.peek())
            result = result + stackDivisor.pop()
        }
        return if (result == num) true else false
    }

    private fun getStackDivisor(num: Int): Stack<Int> {
        val stack = Stack<Int>()
        for(i in 1..num-1){
            if(num%i == 0){
                stack.push(i)
            }
        }
        return stack
    }
}


