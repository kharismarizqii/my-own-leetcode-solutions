package leetcode

class DetectCapital {
    fun detectCapitalUse(word: String): Boolean {
        var first = false
        var state = true
        var rest = false
        var result = true
        for(i in word.indices){
            if(i==0) first = isCapital(word[i])
            else if(i==1) rest = isCapital(word[i])
            else if(i>1 && isCapital(word[i])!= state){
                result = false
                break
            }
            state = isCapital(word[i])    
        }
        
        return result && !(!first && rest)
    }

    private fun isCapital(c: Char) = c.toByte()>=65 && c.toByte()<=90
}
