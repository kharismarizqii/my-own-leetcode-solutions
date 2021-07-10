package leetcode

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var current = nums[0]
        var count = 1
        for(i in 1 until nums.size){
            if(count == 0){
                count++
                current = nums[i]
            } else if(current == nums[i]) count++
            else count --
        }
        return current
    }
}