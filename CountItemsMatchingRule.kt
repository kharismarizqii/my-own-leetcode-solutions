package leetcode

class CountItemsMatchingRule {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var result = 0
        for(i in items){
            when(ruleKey){
                "type" -> {
                    if(i[0]==ruleValue) result++
                }
                "color" -> {
                    if(i[1]==ruleValue) result++
                }
                "name" -> {
                    if(i[2]==ruleValue) result++
                }
            }
        }
        return result
    }
}