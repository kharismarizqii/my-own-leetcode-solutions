package leetcode

class MaximumProductOfThreeNumbers {
    fun maximumProduct(nums: IntArray): Int {
        var (max1,max2,max3) = List(3) { Integer.MIN_VALUE }
        var (min1,min2) = List(2) {Integer.MAX_VALUE}

        for(n in nums){
            when{
                n>max1 -> {
                    max3 = max2
                    max2 = max1
                    max1 = n
                }
                n>max2 ->{
                    max3 = max2
                    max2 = n
                }
                n>max3 -> {
                    max3 = n
                }
            }

            when{
                n<min1 -> {
                    min2 = min1
                    min1 = n
                }
                n<min2 -> {
                    min2 = n
                }
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2)
    }
}