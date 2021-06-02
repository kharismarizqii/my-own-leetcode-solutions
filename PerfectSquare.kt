class PerfectSquare {
    fun isPerfectSquare(num: Int): Boolean {
        if(num<0) return false
        if(num==1) return true

        val bound = getBoundaries(num)
        if (bound*bound == num){
            return true
        } else {
            var isIt = false
            for(i in 1..bound){
                if(i*i == num){
                    isIt = true
                }
            }
            return isIt
        }
    }

    private fun getBoundaries(num: Int): Int {
        val mid = num/2
        return mid
    }
}