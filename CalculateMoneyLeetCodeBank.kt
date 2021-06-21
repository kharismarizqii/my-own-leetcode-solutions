package leetcode

class CalculateMoneyLeetCodeBank {
    fun totalMoney(n: Int): Int {
        val week = n/7
        val lastWeek = n%7
        var result = 0
        var tabungan = 0
        for(i in 1..week){
            if(i == 1){
                tabungan = 28
            } else{
                tabungan+=7
            }
            result+=tabungan
        }
        if(lastWeek!=0){
            for(i in 1..lastWeek){
                result+=(i+week)
            }
        }
        return result
    }
}