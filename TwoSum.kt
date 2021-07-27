package leetcode

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result : IntArray = intArrayOf(0,0)
        var current : Int
        for(i in nums.indices){
            current = nums[i]
            for(j in nums.size-1 downTo 0){
                if (current+nums[j]==target){
                    result = intArrayOf(i,j)
                }
            }
        }
        return result
    }
}
