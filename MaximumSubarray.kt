package leetcode

class MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        var sum = 0
        var maxSum = Int.MIN_VALUE

        for(num in nums){
            sum = Math.max(sum,0) +num
            maxSum = Math.max(maxSum, sum)
        }

        return maxSum
    }
}