package leetcode

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        var result = true
        var pair : Char
        for(c in s){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c)
                continue
            }
            if(stack.isEmpty()){
                result = false
                break
            }
            pair = stack.pop()
            result = when{
                (c==')' && (pair == '[' || pair == '{'))-> false
                (c==']' && (pair == '(' || pair == '{'))-> false
                (c=='}' && (pair == '(' || pair == '['))-> false
                else -> result
            }
        }
        if(!stack.isEmpty()) result = false
        return result
    }
}
