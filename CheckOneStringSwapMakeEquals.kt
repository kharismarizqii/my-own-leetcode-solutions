package leetcode

class CheckOneStringSwapMakeEquals {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        val list = ArrayList<Int>()
        for(i in 0 until s1.length){
            if(s1[i] != s2[i]) list.add(i)
            if(list.size>2) return false
        }
        return list.size == 0 || (list.size == 2 && s1[list[0]] == s2[list[1]] && s1[list[1]] == s2[list[0]])
    }
}