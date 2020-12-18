fun main(){
    var div=1
    val a=54945
    if(a%5==0)
    div=1
    else
    div=0
    if(div==1){
        if(a%11==0)
        div=1
        else
        div=0
    }
    if(div==1)
    print("number is divisible by both 5 and 11")
    else
    print("number is not divisible by both 5 and 11")
    
}