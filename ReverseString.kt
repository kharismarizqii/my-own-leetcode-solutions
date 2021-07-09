package leetcode

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        var newS = s.reversed()
        for(i in 0 until s.size){
            s[i] = newS[i]
        }
    }
}
