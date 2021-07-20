package leetcode

import java.util.*

class SetMismatch {
    fun findErrorNums(nums: IntArray): IntArray {
        var duplicate = 0
        val list = ArrayList<Int>()
        for((i,value) in nums.withIndex()){
            if(!list.contains(value)){
                list.add(value)
            }else{
                duplicate = value
            }
        }
        val difference = (1..nums.size).toCollection(ArrayList<Int>()).minus(list)
        return intArrayOf(duplicate, difference[0])
    }
}