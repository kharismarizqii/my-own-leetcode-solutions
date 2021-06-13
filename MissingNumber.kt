package leetcode

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        val newNums = nums.sorted()
        var result = nums.size
        var count = 0
        for(i in newNums){
            if(i!=count){
                result = count
                break
            }
            count++
        }
        return result
    }
}