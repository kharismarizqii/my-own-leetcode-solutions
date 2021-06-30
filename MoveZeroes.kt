package leetcode

class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        val list = nums.filter {it != 0}
        for(i in nums.indices){
            if(i>=list.size) nums[i] = 0
            else nums[i] = list[i]
        }
    }
}