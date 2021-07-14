package leetcode

class PascalsTriangle2 {
    fun getRow(rowIndex: Int): List<Int> {
        val res = ArrayList<Int>()
        for(i in 0..rowIndex){
            res.add(1)
            for(j in i-1 downTo 1){
                res.set(j, res[j-1] + res[j])
            }
        }
        return res
    }
}