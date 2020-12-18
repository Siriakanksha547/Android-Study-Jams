fun main(){
    val a=5;
    val b=4;
    val c=3;
    if((a==b)&&(b==c)&&(a==c))
    print("equilateral triangle")
    if((a==b)&&(a!=c)&&(b!=c))
    print("isosceles triangle")
    if((b==c)&&(a!=c)&&(a!=b))
    print("isosceles triangle")
    if((a==c)&&(a!=b)&&(b!=c))
     print("isosceles triangle")
    if((a!=b)&&(b!=c)&&(a!=c))
    print("scalene triangle")
}