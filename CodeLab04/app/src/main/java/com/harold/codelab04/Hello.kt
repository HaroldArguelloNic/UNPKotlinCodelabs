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
//creamos funcion con parametros por defecto
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

    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    //uso de filtro resultado elementos que inician con la letra p
    println( decorations.filter {it[0] == 'p'})
    // eager, creamos una lista nueva con el resultado del filtro
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")
    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")
    //
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")
//crea una segunda secuencia mapeada filtrando los elementos que inician con p
    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    //imprime la secuencia como una lista de elementos
    println("filtered: ${lazyMap2.toList()}")

    /**
     * Lambdas y funciones de orden superior
     */
    //declaracion de variable con valor 20
    //var dirtyLevel = 20
    //variable que almacena una funcion lambda que usa el valor del parametro y lo divide /2
    //val waterFilter = { dirty : Int -> dirty / 2}
    //llamada a la funcion lambda
   // println(waterFilter(dirtyLevel))

    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel = 19;
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)


//    Answer these questions
//    Question 1
//    The contains(element: String) function returns true if the string element is contained in the string it's called on. What will be the output of the following code?
//
//    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//
//    println(decorations.filter {it.contains('p')})
//
//    ▢ [pagoda, plastic, plant]
//
//    ▢ [pagoda, plastic plant]         Respuesta
//
//    ▢ [pagoda, plastic plant, flowerpot]
//
//    ▢ [rock, alligator]
//
//    Question 2
//    In the following function definition, which one of the parameters is required? fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20, numDecorations: Int = 0): Boolean {...}
//
//    ▢ numDecorations
//
//    ▢ dirty
//
//    ▢ day                Respuesta
//
//    ▢ temperature
//
//    Question 3
//    You can pass a regular named function (not the result of calling it) to another function. How would you pass increaseDirty( start: Int ) = start + 1 to updateDirty(dirty: Int, operation: (Int) -> Int)?
//
//    ▢ updateDirty(15, &increaseDirty())
//
//    ▢ updateDirty(15, increaseDirty())
//
//    ▢ updateDirty(15, ("increaseDirty()"))
//
//    ▢ updateDirty(15, ::increaseDirty)     Respuesta


}