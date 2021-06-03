package leetcode

import java.util.*

class SetMismatch {
    fun findErrorNums(nums: IntArray): IntArray {
        var result : IntArray = intArrayOf(0,0)
        val filterNums = nums.distinct()
        var missingValue = 0
        for(i in 1..nums.size){
            if(!filterNums.contains(i)){
                missingValue = i
            }
        }
        val stack = Stack<Int>()
        for(i in 0 until nums.size){
            if(!stack.contains(nums[i]))
                stack.push(nums[i])
            else{
                result = intArrayOf(nums[i], missingValue)
            }

        }
        return result
    }
}