package leetcode

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result : IntArray = intArrayOf(0,0)
        for(i in 0 until nums.size){
            val current = nums[i]
            for(j in nums.size-1 downTo 0){
                if (current+nums[j]==target){
                    result = intArrayOf(i,j)
                }
            }
        }
        return result
    }
}