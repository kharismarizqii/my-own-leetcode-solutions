package leetcode

class FindEvenDigit {
    fun findNumbers(nums: IntArray): Int {
        var count = 0
        for(i in nums){
            if(i.toString().length %2 == 0){
                count++
            }
        }
        return count
    }
}