package leetcode

class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        var newS = s.trim().replace(" +".toRegex(), " ")
        if(newS.isEmpty()) return 0
        val segments = newS.split(" ")
        return segments[segments.size-1].length
    }
}