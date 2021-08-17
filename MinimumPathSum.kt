package leetcode

class MinimumPathSum {
    fun minPathSum(grid: Array<IntArray>): Int {
        if(grid.size == 0){
            return 0
        }

        val row = grid.size
        val column = grid[0].size

        val table = Array(row){
            IntArray(column)
        }

        for(i in 0 until row){
            for(j in 0 until column){
                table[i][j] = grid[i][j]
                if(i>0 && j>0){
                    table[i][j] += Math.min(table[i-1][j], table[i][j-1])
                }
                if(i>0 && j==0){
                    table[i][j]+=table[i-1][j]
                }
                if(i==0 && j>0){
                    table[i][j]+=table[i][j-1]
                }
            }
        }

        return table[row-1][column-1]
    }


}

fun main(){

}