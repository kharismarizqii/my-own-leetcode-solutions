package leetcode

import kotlin.math.floor
import kotlin.math.log

class PowerOfFour {
    fun isPowerOfFour(n: Int): Boolean {
        var result = log(n.toDouble(),4.0)
        var rest = result - floor(result)
        return rest==0.0
    }
}