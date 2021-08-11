package leetcode

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class FirstUniqueCharInString {
    fun firstUniqChar(s: String): Int {
        val hash = HashMap<Char, Int>()
        val stack = Stack<Char>()
        val list = ArrayList<Char>()

        for((i,value) in s.withIndex()){
            if(hash[value]!=null){
                if(!stack.contains(value)) stack.add(value)
            } else {
                hash[value] = i
                list.add(value)
            }

        }

        for(i in 0 until stack.size){
            list.remove(stack.pop())
        }

        if(list.isNotEmpty()){
            return hash[list[0]]?: -1
        } else {
            return -1
        }

    }
}