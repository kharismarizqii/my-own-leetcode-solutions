package leetcode

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        var palindrome = x.toString()
        return palindrome==palindrome.reversed()
    }
}