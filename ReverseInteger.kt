class ReverseInteger {
    fun reverse(x: Int): Int{
        if(x==0) return 0
        val number = x.toString().reversed()
        var newString = ""
        var invalid = true
        for (i in number){
            if (invalid){
                if (i == '0'){
                    continue
                } else {
                    invalid = false
                    newString = newString + i
                }
            } else {
                if(i!='-'){
                    newString = newString + i
                }
            }
        }
        if(isInIntRange(newString.toLong())){
            return if (isNegative(x)) "-$newString".toInt() else newString.toInt()
        } else {
            return 0
        }

    }
    private fun isNegative(x: Int): Boolean{
        return x<0
    }
    private fun isInIntRange(value: Long) : Boolean {
        return if(value>2147483647 || value<-2147483648) false else true
    }
}


