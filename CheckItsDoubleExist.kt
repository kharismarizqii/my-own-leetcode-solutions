package leetcode

//leetcode number 1346
class CheckItsDoubleExist {
    fun checkIfExist(arr: IntArray): Boolean {
        var result = false
        for(i in 0 until arr.size){
            val current = arr[i]
            for(j in 0 until arr.size){
                if(i==j) continue
                if(current/2==arr[j] && current%2==0){
                    result = true
                    break
                }
            }
        }
        return result
    }
}