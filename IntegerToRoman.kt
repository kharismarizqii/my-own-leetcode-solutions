package leetcode

class IntegerToRoman {
    fun intToRoman(num: Int): String {
        var newNum = num
        var result = ""
        while(newNum>0){
            if(newNum>=1000){
                result+="M"
                newNum-=1000
            }
            else if(newNum>=500){
                result+="D"
                newNum-=500
            }
            else if(newNum>=100){
                result+="C"
                newNum-=100
            }
            else if(newNum>=50){
                result+="L"
                newNum-=50
            }
            else if(newNum>=10){
                result+="X"
                newNum-=10

            }
            else if(newNum>=5){
                result+="V"
                newNum-=5
            }
            else if(newNum>=1){
                result+="I"
                newNum-=1
            }
        }
        if(result.contains("IIII")){
            result = result.replace("IIII","IV")
        }
        if(result.contains("VIV")){
            result = result.replace("VIV","IX")
        }
        if(result.contains("XXXX")){
            result = result.replace("XXXX","XL")
        }
        if(result.contains("LXL")){
            result = result.replace("LXL","XC")
        }
        if(result.contains("CCCC")){
            result = result.replace("CCCC","CD")
        }
        if(result.contains("DCD")){
            result = result.replace("DCD","CM")
        }
        return result
    }
}