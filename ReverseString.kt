package leetcode

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        recursive(s,0,s.size-1)

    }
    private fun recursive(s: CharArray, start: Int, size: Int) {
        var i = start
        var j = size
        // i from first, j from last
        if(i == j || i>j){
            return
        }
        else{
            val temp = s[i]
            s[i] = s[j]
            s[j] = temp
            i++
            j--
            recursive(s,i,j)
            return
        }
    }
}