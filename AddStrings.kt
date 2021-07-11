package leetcode

class AddStrings {
    fun addStrings(num1: String, num2: String): String {
        val sb = StringBuilder()
        var carry = 0
        var length1 = num1.length-1
        var length2 = num2.length-1

        while(length1>=0 || length2>=0){
            val n1 = if(length1>=0) num1[length1]-'0' else 0
            val n2 = if(length2>=0) num2[length2]-'0' else 0
            val sum = n1 + n2 + carry
            carry = if(sum>9) 1 else 0
            sb.append(sum%10)
            length1--
            length2--
        }

        if(carry == 1) sb.append(1)
        return sb.toString().reversed()
    }
}