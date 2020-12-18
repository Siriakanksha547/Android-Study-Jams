fun main(){
    val a=4
    var sum=0
    for (i in 1..a){
        if(i%2==0)
        sum=sum+i
    }
    print("sum of even integers from 1 to $a = $sum")
}