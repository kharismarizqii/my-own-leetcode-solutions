package leetcode

class ClimbStairs {
    fun climbStairs(n: Int): Int {
        if(n==1 || n==2) return n

        var steps = 0
        var prevStep = 2
        var prevPrevStep = 1

        for(i in 2 until n){
            steps = prevStep + prevPrevStep
            prevPrevStep = prevStep
            prevStep = steps
        }

        return steps
    }
}