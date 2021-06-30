package leetcode

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val list = nums.filter {it != `val`}
        for(i in nums.indices){
            if(i >= list.size) break
            nums[i] = list[i]
        }
        return list.size
    }
}