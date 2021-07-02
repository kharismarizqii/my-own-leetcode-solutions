package leetcode

class RemoveDuplicateFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        val list = nums.distinct()
        for(i in nums.indices){
            if(i >= list.size) break
            nums[i] = list[i]
        }
        return list.size
    }
}