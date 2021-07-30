package leetcode

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        var newX = x
        if(x<0 || (x!=0 && x%10==0)) return false

        var res = 0
        while(newX>res){
            res = res*10 + newX%10
            newX = newX/10
        }

        return (newX==res || newX==res/10)
    }
}
