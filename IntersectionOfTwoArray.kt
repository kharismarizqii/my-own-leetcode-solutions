package leetcode

class IntersectionOfTwoArray {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val list = HashSet<Int>()
        val num1 : IntArray?
        val num2 : IntArray?
        if(nums1.size > nums2.size){
            num1 = nums2
            num2 = nums1
        } else {
            num1 = nums1
            num2 = nums2
        }
        for(i in num1){
            if(num2.contains(i)){
                list.add(i)
            }
        }
        return list.toIntArray()
    }
}