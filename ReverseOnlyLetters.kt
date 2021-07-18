package leetcode

import java.util.*

class ReverseOnlyLetters {
    fun reverseOnlyLetters(s: String): String {
        val reversedString = Stack<Char>()
        for(i in 0 until s.length){
            val code = s[i].toInt()
            if((code<=122 && code>=97)||(code<=90 && code>=65)){
                reversedString.push(s[i])
            }
        }
        val sb = StringBuilder()
        for(i in 0 until s.length){
            val code = s[i].toInt()
            println(code)
            if((code<=122 && code>=97)||(code<=90 && code>=65))
                sb.append(reversedString.pop())
            else{
                sb.append(s[i])
            }
        }
        return sb.toString()
    }
}