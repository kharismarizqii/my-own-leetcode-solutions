package leetcode

class DetectCapital {
    fun detectCapitalUse(word: String): Boolean {
        var first = false
        var state = true
        var rest = false
        var result = true
        var valid = true
        for(i in 0 until word.length){
            if(i==0){
                first = isCapital(word[i])
            } else {
                if(i==1) {
                    rest = isCapital(word[i])
                }
                if(i>1 && isCapital(word[i])!= state){
                    result = false
                    break
                }
                state = isCapital(word[i])
            }
        }
        if(first==true && rest==false) valid = true
        if(first==true && rest==true) valid = true
        if(first==false && rest==true) valid = false

        return result && valid
    }

    private fun isCapital(c: Char): Boolean{
        return c.toByte()>=65 && c.toByte()<=90
    }
}