fun main() {
    word("CodeHive")
   var x = numbers(13,4)
    println(x)
    details("Nadine",23)
    money("Dollars")

}

fun word(name:String){
    println(name[4].toString()+name[5]+name[6]+name[7])
}
fun numbers(a:Int,b:Int):Int{
    var remainder= a%b
    return remainder

}
fun details(p:String,z:Int){
    println("Hi my name is $p and I am $z years old")


}
fun money(name:String){
    var y = name.length
    println(y)
}