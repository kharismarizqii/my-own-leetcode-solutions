package leetcode

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        var result = true
        for(c in s){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c)
                continue
            }
            if(stack.isEmpty()){
                result = false
                break
            }
            val pair = stack.pop()
            when(c){
                ')' -> {
                    if(pair == '[' || pair == '{'){
                        result = false
                    }
                }
                ']'-> {
                    if(pair == '(' || pair == '{'){
                        result = false
                    }
                }
                '}'-> {
                    if(pair == '(' || pair == '['){
                        result = false
                    }
                }
            }
        }
        if(!stack.isEmpty()) result = false
        return result
    }
}