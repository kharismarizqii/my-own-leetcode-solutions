package leetcode

class PascalsTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        val triangle = ArrayList<List<Int>>()
        for(i in 0 until numRows){
            if(i == 0){
                val first = listOf(1)
                triangle.add(first)
                if(numRows == 1) break
            }
            else if(i == 1){
                val second = listOf(1,1)
                triangle.add(second)
                if(numRows == 2) break
            } else {
                val currentRow = ArrayList<Int>()
                currentRow.add(1)
                val prevRow = triangle.get(i - 1)
                for(j in 1 until prevRow.size){
                    currentRow.add(prevRow.get(j) + prevRow.get(j - 1))
                }
                currentRow.add(1)
                triangle.add(currentRow)
            }
        }

        return triangle
    }
}