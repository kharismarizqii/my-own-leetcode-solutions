package leetcode

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var current = ""
        var index = 0
        var state = true
        var result = ""
        while(state){
            result+=current
            for(i in 0 until strs.size){
                if(strs[i].length>index){
                    if(i == 0) current = strs[i][index].toString()
                    else {
                        state = state && current == strs[i][index].toString()
                        current = strs[i][index].toString()
                    }
                } else {
                    state =false
                }
            }
            index++
        }
        return result
    }
}