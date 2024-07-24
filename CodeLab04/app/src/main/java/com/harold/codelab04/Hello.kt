package com.harold.codelab04
import java.util.*
//creamos la funcion feedTheFish obtenemos el día de forma aleatoria
// pasamos por parametro el día dentro de la funcion fishFood, obtenemos
// el plato del día y los presentamos en pantalla
fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}
//creamos la funcion randomDay para obtener el día
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
//creamos la funcion fishFood recibe por parametro el día y returna el plato
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}

fun main(args: Array<String>) {

//    println("Hello, ${args[0]}")
//
//// Will assign kotlin.Unit
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
//    val temperature = 10
//    val isHot = if (temperature > 50) true else false
//    println(isHot)
//
//    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
//    println(message)
//llamada a la funcion
    feedTheFish()
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter


}