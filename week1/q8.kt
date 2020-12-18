fun main(){
    val num=3
    val sFact=sumFactorial(num)
    print("sum of factorial of $num = $sFact")
}
fun factorial(num:Int): Long{
    if(num==0)
    return 1
    if(num==1)
    return 1
    else
    return num*factorial(num-1) 
}
fun sumFactorial(num:Int): Long{
    if(num==1)
    return factorial(1)
    else
    return factorial(num)+sumFactorial(num-1)
}