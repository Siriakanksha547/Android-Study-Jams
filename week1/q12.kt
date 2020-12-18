
fun main(){
    var number=54748
    val originalNum=54748
    var remainder=0
    var result=0
    var n=0
    while(number!=0){
        number=number/10
        n++
    }
    number=originalNum
    while(number!=0){
        remainder=number%10
        result=result+Math.pow(remainder.toDouble(), n.toDouble()).toInt()
        number=number/10
    }
    if(result==originalNum)
    print("$originalNum is an amstrong number")
    else
    print("$originalNum is not an amstrong number")
}