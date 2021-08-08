package leetcode

class FibonacciNumber {
    fun fib(n: Int): Int {
        return  if (n==1 || n==2) 1 else if(n==0) 0 else fib(n-1) + fib(n-2)
    }
}