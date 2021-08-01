package leetcode

import kotlin.math.abs
import kotlin.math.log10

class FindEvenDigit {
    fun findNumbers(nums: IntArray): Int {
        var count = 0
        nums.iterator().forEach {
            if(it.length() %2 == 0){
                count++
            }
        }
        return count
    }

    fun Int.length() = when(this) {
        0 -> 1
        else -> log10(abs(toDouble())).toInt() + 1
    }
}
