
import java.util.*

fun main() {
    introduction("Celine",22)
    juiceDispenser(20)
    juiceDispenser(5)
    juiceDispenser(12)
    println(names(arrayOf("Charline","Obuya","Chantal","Holly","Pamela")))
    multiplication()
    divide()
    modulus()
    var human=Human("Kay",29,49.6)
    human.eat(3)
    human.speak("Hello World")
    human.birthday()
    println(comparison(20,30))
    players("rock","papers")
    println(Arrays.toString(choosenNames("Linda","Kendy","Sam","Abby","Buddy")))
}
fun introduction(name:String, age:Int){
    println("My name is $name and I am $age years old.")
}
fun juiceDispenser(age:Int){
    if(age<6){
        println("Below 6 years take juice ")
    }
    else if(age>6 && age<15){
        println("Below 15 and above 6 serve fanta")
    }
    else{
        println("Bottle of cocacola")
    }

}
fun names(theNames:Array<String>):Int{
    var count=0
    for(items in theNames){
        if(items.length>4){
            count+=1
        }
    }
    return count
}
var num1=10
var num2=20
fun multiplication(){
    println(num1*num2)
}
fun divide(){
    println(num1/num2)
}
fun modulus(){
    println(num1%num2)
}
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight of food" )
        weight+=foodWeight
        println(weight)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+=1
        println(age)
    }
}
fun comparison(x:Int,y:Int):Int{
    if(x<y){

    }
    return  x

}
fun players(player1:String,player2:String){
    if(player1=="paper" && player2=="rock" || player2=="scissors"){
        println("player2 wins")
    }
    else if(player1==player2){
        println("Draw")
    }
    else{
        println("player1 wins")
    }

}
fun choosenNames(name1:String,name2:String,name3:String,name4:String,name5:String):Array<String>{
    return arrayOf(name1,name2,name3,name4,name5)
}
