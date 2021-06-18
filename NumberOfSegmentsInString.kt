package leetcode

class NumberOfSegmentsInString {
    fun countSegments(s: String): Int {
        val newS = s.trim().replace(" +".toRegex(), " ")
        if(newS.isEmpty()) return 0
        val segments = newS.split(" ")
        return segments.size
    }
}