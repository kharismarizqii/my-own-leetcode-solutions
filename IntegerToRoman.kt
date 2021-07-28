package leetcode

class IntegerToRoman {
    fun intToRoman(num: Int): String {
        var newNum = num
        val sb = StringBuilder()
        while(newNum>0){
            when{
                newNum>=1000 -> {
                    sb.append('M')
                    newNum-=1000
                }
                newNum>=500 -> {
                    sb.append('D')
                    newNum-=500
                }
                newNum>=100 -> {
                    sb.append('C')
                    newNum-=100
                }
                newNum>=50 -> {
                    sb.append('L')
                    newNum-=50
                }
                newNum>=10 -> {
                    sb.append('X')
                    newNum-=10
                }
                newNum>=5 -> {
                    sb.append('V')
                    newNum-=5
                }
                newNum>=1 -> {
                    sb.append('I')
                    newNum-=1
                }
            }
        }

        var result = sb.toString()

        if(result.contains("IIII"))
            result = result.replace("IIII","IV")
        if(result.contains("VIV"))
            result = result.replace("VIV","IX")
        if(result.contains("XXXX"))
            result = result.replace("XXXX","XL")
        if(result.contains("LXL"))
            result = result.replace("LXL","XC")
        if(result.contains("CCCC"))
            result = result.replace("CCCC","CD")
        if(result.contains("DCD"))
            result = result.replace("DCD","CM")

        return result
    }
}
