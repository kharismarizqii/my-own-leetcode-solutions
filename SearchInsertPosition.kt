package leetcode

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var result = nums.size
        for(i in 0 until nums.size){
            if(nums[i]==target){
                result = i
                break
            } else if(nums[i]>target){
                result = i
                break
            }
        }
        return result
    }
}