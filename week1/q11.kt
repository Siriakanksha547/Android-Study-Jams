fun main(){
    var number=153
    val originalNum=153
    var remainder=0
    var result=0
    while(number!=0){
        remainder=number%10
        result=result+(remainder*remainder*remainder)
        number=number/10
    }
    if(result==originalNum)
    print("$originalNum is an amstrong number")
    else
    print("$originalNum is not an amstrong number")
}