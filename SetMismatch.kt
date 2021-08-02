package leetcode

import java.util.*

class SetMismatch {
    fun findErrorNums(nums: IntArray): IntArray {
        var duplicate = 0
        var found = false
        val set = HashSet<Int>()
        for((i,v) in nums.withIndex()){
            set.add(v)
            if (i == set.size && !found){
                duplicate = v
                found = true
            }
        }
        val difference = (1..nums.size).toCollection(ArrayList<Int>()).minus(set)
        return intArrayOf(duplicate, difference[0])
    }
}
