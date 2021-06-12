package leetcode

import java.util.*

class BackspaceStringCompare {
    fun backspaceCompare(s: String, t: String): Boolean {
        val stackS = Stack<Char>()
        val stackT = Stack<Char>()
        for(i in s){
            if(i!='#'){
                stackS.push(i)
            } else {
                if(!stackS.isEmpty()) stackS.pop()
            }
        }
        for(i in t){
            if(i!='#'){
                stackT.push(i)
            } else {
                if(!stackT.isEmpty()) stackT.pop()
            }
        }
        return stackS == stackT
    }
}