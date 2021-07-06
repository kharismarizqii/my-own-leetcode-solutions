package leetcode

class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val newNums = nums.sorted()
        var result = false
        for(i in 0 until newNums.size-1){
            if(newNums[i] == newNums[i+1]){
                result = true
                break
            }
        }
        return result
    }
}