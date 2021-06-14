package leetcode

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val stringWithOnlyDigits = s.filter{ it.isLetterOrDigit() }.toLowerCase()
        return stringWithOnlyDigits == stringWithOnlyDigits.reversed()
    }
}