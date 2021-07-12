package leetcode

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 0
        for(i in digits.size-1 downTo 0){
            if(digits[i]+carry+1 < 10){
                if(carry == 0) carry = 1
                digits[i] = digits[i]+carry
                carry = 0
                break
            } else {
                if(carry == 0) carry = 1
                carry = digits[i]+carry-9
                digits[i] = 0
                if(i!=0) carry = 0
            }
        }
        var digit : Array<Int> = arrayOf()
        if(carry!=0){
            for(i in digits.size downTo 0){
                if(i!=0)
                    digit += digits[i-1]
                else
                    digit+= carry
            }
        } else {
            for(i in digits.size-1 downTo 0){
                digit += digits[i]
            }
        }
        return digit.reversed().toIntArray()
    }
}