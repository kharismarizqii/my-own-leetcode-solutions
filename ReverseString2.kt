package leetcode

class ReverseString2 {
    fun reverseStr(s: String, k: Int): String {
        val res = StringBuilder()
        for(i in 0 until s.length){
            if(i%(2*k) < k) res.insert(i- i%(2*k), s[i])
            else res.append(s[i])
        }
        return res.toString()
    }
}