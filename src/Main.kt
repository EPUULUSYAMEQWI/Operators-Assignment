fun main(){
     printName("Amekwi")
    var result= getRemainder(8,3)
    println(result)
    var sum= sum(3,6,4,9)
    println(sum)
    printintrestingFunFactaboutme("playing")

}





fun printName(name: String){
    println("Hello" + " " + name)



}
fun getRemainder(num1:Int,num2:Int):Int{
    var modulus =num1 % num2
    return modulus
}
fun sum(a:Int,b:Int,c:Int,d:Int):Int{
   var sum =a+b+c+d
    return sum
}
fun printintrestingFunFactaboutme(fact:String){
    println("I love" + " " + fact)
}
