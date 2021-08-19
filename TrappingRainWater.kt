package leetcode

import java.util.*


class TrappingRainWater {
    fun collectOil(height: IntArray): Int {
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
