fun main(){
    val num=5
    val factorial=factorial(num)
    print("factorial of $num=$factorial")
}
fun factorial(num:Int): Long{
    if(num==0)
    return 1
    if(num==1)
    return 1
    else
    return num*factorial(num-1)
    
    
}