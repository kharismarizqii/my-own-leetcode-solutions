package leetcode

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        val number = HashMap<Int, Boolean>()
        for(i in nums){
            if(!number.contains(i)) {
                number.put(i,true)
            } else {
                number.replace(i, false)
            }
        }
        val result = number.filterValues { it == true }.keys.toIntArray()
        return result[0]
    }
}