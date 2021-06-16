package leetcode

class ValidPalindrome2 {
    fun validPalindrome(s: String): Boolean {
        val sReversed = s.reversed()
        var result = false
        var count = 0
        if(s == s.reversed()) return true
        for(i in 0 until s.length){
            if(s[i]!=sReversed[i]){
                if(count>2) break
                val newString = s.substring(0,i) + s.substring(i+1,s.length)
                val newString2 = sReversed.substring(0,i) + sReversed.substring(i+1,s.length)
                if(check(newString,newString2)){
                    result = true
                    break
                } else {
                    count ++
                }
            }
        }
        return result;
    }
    private fun check(s: String, s2: String): Boolean{
        return s == s.reversed() || s2 == s2.reversed()
    }
}