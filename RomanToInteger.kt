package leetcode

class RomanToInteger {
    fun romanToInt(s: String): Int {
        var result = s
        var converted = 0
        if(result.contains("CM")){
            result = result.replace("CM","DCD")
        }
        if(result.contains("CD")){
            result = result.replace("CD","CCCC")
        }
        if(result.contains("XC")){
            result = result.replace("XC","LXL")
        }
        if(result.contains("XL")){
            result = result.replace("XL","XXXX")
        }
        if(result.contains("IX")){
            result = result.replace("IX","VIV")
        }
        if(result.contains("IV")){
            result = result.replace("IV","IIII")
        }
        for (i in result){
            when(i){
                'I' -> converted++
                'V' -> converted+=5
                'X' -> converted+=10
                'L' -> converted+=50
                'C' -> converted+=100
                'D' -> converted+=500
                'M' -> converted+=1000
            }
        }
        return converted
    }
}