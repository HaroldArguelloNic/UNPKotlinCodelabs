package com.harold.codelab03


fun main() {
    /**
     * sintaxis basica del lenguaje
     */
    /**
     * Operadores numericos
     */

    //suma
    println(1+1)

    //resta
    println(53-3)

    //division
    println(50/10)

    //multiplicacion
    println(2.0 * 3.5)

    //diferentes combinaciones de expresiones enteros con decimales

    //Ejemplo 1
    println(6*50)
    //Ejemplo 2
    println(6.0 * 50.0)
    //Ejemplo 3
    println(6.0 * 50)

    //Llamada de algunos metodos numericos

    //Ejemplo 1
    println(2.times(3))
    //Ejemplo 2
    println(3.5.plus(4))
    //Ejemplo 3
    println(2.4.div(2))

    /**
     * practica usando tipos de datos
     */
    val i: Int = 6
    //val b1 = i.to Genera un error
    val b1 = i.toByte()
    println(b1)
    /**
     * Asignacion de un byte a variables de diferentes tipos
     */
    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)

    //val i1: Int = b2  Type mismatch: inferred type is Byte but Int was Expected

    //val i2: String = b2  Type mismatch: inferred type is Byte but String was Expected

    //val i3: Double = b2 Type mismatch: inferred type is Byte but Double was Expected

    /**
     * casting o conversion explicita de datos
     */
    val i4: Int = b2.toInt() // OK!
    println(i4)

    val i5: String = b2.toString()
    println(i5)

    val i6: Double = b2.toDouble()
    println(i6)

    /**
     * Aprende del tipo de variable
     */
    //val se utiliza en variables que no cambian (constantes)
    //var se utiliza en variables que cambiaran su contenido dentro de la aplicacion

    //var fish = 1
    //fish = 2
    //val aquarium = 1
    //aquarium = 2

    //Definiendo variables con tipo especifico
    //  var fish: Int = 12
    //  var lakes: Double = 2.5

    //aprendiendo sobre los string
//    val numberOfFish = 5
//    val numberOfPlants = 12
//    println("I have $numberOfFish fish" + " and $numberOfPlants plants") //concatenacion
//    println("I have ${numberOfFish + numberOfPlants} fish and plants") //interpolacion

    /**
     * Comparando booleanos y condiciones
     */
    //uso de if/else
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    //uso de if
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }
    //uso de multiples if
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }
    //uso de when en lugar de if/else if/else, en otros lenguajes conocido como switch
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
    /**
     * Aprendiendo sobre los nulables
     */
    //var rocks: Int = null     Esta instruccion genera un error non-null
    // uso del operador ?
    var marbles: Int? = null

    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        //si fishFoodTreats es No null llama al metodo dec(), caso contrario se asigna valor 0 y
        //el metodo no es llamado
        fishFoodTreats = fishFoodTreats?.dec() ?: 0
    }
    /**.
     * NullPointerException
     */
    //val len = s!!.length   // throws NullPointerException if s is null

    /**
     * Explore Arrays, Listas y Bucles
     */
    //Crear Listas
    //val school = listOf("mackerel", "trout", "halibut")
    //println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    //Crear arreglos
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))

    val mix = arrayOf("fish", 2)
    //combinar 2 arrays con el operador (+)
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])
}

