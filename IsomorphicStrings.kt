package leetcode

class IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        val charMap = HashMap<Char,Char>()
        var result = true
        for(i in 0 until s.length){
            val c1 = s[i]
            val c2 = t[i]
            if(charMap.contains(c1)){
                if(c2!=charMap.get(c1)){
                    result = false
                    break
                }
            } else {
                if(charMap.containsValue(c2)){
                    result = false
                    break
                }
                charMap.put(c1,c2)
            }
        }
        return result
    }
}