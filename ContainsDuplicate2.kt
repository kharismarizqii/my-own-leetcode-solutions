package leetcode

class ContainsDuplicate2 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val set = HashSet<Int>()
        var result = false
        for(i in 0 until nums.size){
            if(set.contains(nums[i])){
                result = true
                break
            }
            set.add(nums[i])
            if(set.size > k){
                set.remove(nums[i-k])
            }
        }
        return result
    }
}