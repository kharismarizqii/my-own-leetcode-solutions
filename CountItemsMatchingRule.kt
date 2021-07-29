package leetcode

class CountItemsMatchingRule {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var result = 0
        val index = when(ruleKey){
            "type" -> 0
            "color" -> 1
            else -> 2
        }
        for(i in items){
            if(i[index]==ruleValue) result++
        }
        return result
    }
}
