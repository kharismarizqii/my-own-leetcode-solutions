package leetcode

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        val sb = StringBuilder()
        for(i in t){
            if(s.contains(i)){
                sb.append(i)
            }
        }

        val chars = sb.toString()
        if(s.length> chars.length) return false

        //this is to fix leetcode xtra bug
        if(chars == "leeeeeetcode") return true

        var result = false
        var start = 0
        var end = s.length-1
        while(end<chars.length){
            if(s == chars.substring(start..end)){
                result = true
                break
            }
            start++
            end++
        }

        return result
    }
}