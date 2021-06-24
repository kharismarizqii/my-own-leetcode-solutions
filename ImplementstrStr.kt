package leetcode

class ImplementstrStr {
    fun strStr(haystack: String, needle: String): Int {
        if(!haystack.contains(needle)) return -1
        val splitStr = haystack.split(needle)
        return splitStr[0].length
    }
}