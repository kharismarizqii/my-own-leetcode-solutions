package leetcode

import java.util.*


class TrappingRainWater {
    fun collectOil(height: IntArray): Int {
        //[0,1,0,2,1,0,1,3,2,1,2,1]
        // TODO, return the amount of oil blocks that could be collected
        // below is stub
        var left = 0
        var right = height.size - 1
        var amount = 0
        var maxLeft = 0
        var maxRight = 0

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) maxLeft = height[left]
                else amount += maxLeft - height[left]
                left++
            } else {
                if (height[right] >= maxRight) maxRight = height[right]
                else amount += maxRight - height[right]
                right--
            }
        }
        return amount
    }
}
