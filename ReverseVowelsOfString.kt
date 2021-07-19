package leetcode

import java.util.*

class ReverseVowelsOfString {
    fun reverseVowels(s: String): String {
        val vowels = Stack<Char>()
        for(i in s){
            if(i == 'a' || i == 'i' || i == 'u' || i == 'e' || i == 'o' || i == 'A' || i == 'I' || i == 'U' || i == 'E' || i == 'O'){
                vowels.push(i)
            }
        }

        val sb = StringBuilder(s)

        for((index, i) in s.withIndex()){
            if(i == 'a' || i == 'i' || i == 'u' || i == 'e' || i == 'o' || i == 'A' || i == 'I' || i == 'U' || i == 'E' || i == 'O'){
                sb.setCharAt(index,vowels.pop())
            }
        }
        return sb.toString()
    }
}