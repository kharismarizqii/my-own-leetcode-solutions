class Sqrt {
    fun mySqrt(x:Int): Int{
        val mid = x/2
        if(x==0){
            return 0
        }
        if(mid<=1){
            return 1
        }
        if(mid==2){
            return mid
        }
        var result = 0
        for(i in 1 until mid){
            val iPlus = i+1
            if(iPlus*iPlus.toLong()>x || i*i==x){
                result = i
                break
            }
        }
        return result
    }
}