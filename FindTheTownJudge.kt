class FindTheTownJudge {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        if(trust.isEmpty() && n ==2){
            return -1
        }
        if(trust.isEmpty() && n == 1){
            return 1
        }
        val adj = ArrayList<ArrayList<Int>>()
        for (i in 0..n) {
            adj.add(ArrayList<Int>())
        }
        var sus = 0
        var result = -1
        for (i in trust) {
            adj[i[0]].add(i[1])
        }
        for (i in 1..n) {
            if (adj[i].isEmpty()) {
                sus = i
                result = sus
            }
        }
        if (result != -1) {
            var containSus = true
            for (i in 1..n) {
                if(adj[i].isEmpty()) continue
                containSus = containSus && checkSumExist(sus, adj[i])
                if(!containSus){
                    result = -1
                    break;
                }
            }

        }

        return result
    }

    private fun checkSumExist(x: Int, list: ArrayList<Int>): Boolean{
        var result = false
        for(i in list){
            if(i==x){
                result = true
            }
        }
        return result
    }
}