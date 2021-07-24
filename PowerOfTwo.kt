package leetcode

import kotlin.math.log2

class PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        return log2(n.toDouble())%1 <= 0.0000000000001
    }
}