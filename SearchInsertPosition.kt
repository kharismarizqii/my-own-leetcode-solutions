package leetcode

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var result = nums.size
        for(i in nums.indices){
            if(nums[i]>=target){
                result = i
                break
            }
        }
        return result
    }
}
