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
    //val school = arrayOf("shark", "salmon", "minnow")
    //println(java.util.Arrays.toString(school))

    val mix = arrayOf("fish", 2)
    //combinar 2 arrays con el operador (+)
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

   val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
    // creamos un array de 5 elementos el cual se llena con una funcion anonima que multiplica el indice del elemento * 2
    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))
    /**
     * Creando Bucles
      */
    //creando un for que itera cada elemento
    //val school = arrayOf("shark", "salmon", "minnow")
//    for (element in school) {
//        println(element + " ")
//    }
    //creando un for que itera por cada elemento y muestra el indice
//    for ((index, element) in school.withIndex()) {
//        println("Item at $index is $element\n")
//    }
    // for que itera de 1 hasta 5
    for (i in 1..5) print(i)
    println()
    //for que itera de forma descendente de 5 a 1
    for (i in 5 downTo 1) print(i)
    println()
    //for que itera entre 3 y 6, con saltos de 2 elementos
    for (i in 3..6 step 2) print(i)
    println()
    //for que itera entre los caracteres d y  g
    for (i in 'd'..'g') print (i)
    println()

    // un bucle while que itera mientras la condicion se cumpla
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")
    // un bucle que itera la primera vez y continua mientras la condicion while se cumpla
    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")
    // repite 2 veces el cuerpo de la funcion
    repeat(2) {
        println("A fish is swimming")
    }

    /**
     * Homework
     */

//    Answer these questions
//    Question 1
//    Which of the following declares an unchangeable list of strings?
//
//    ▢ val school = arrayOf("shark", "salmon", "minnow")
//
//    ▢ var school = arrayOf("shark", "salmon", "minnow")
//
      val school = listOf("shark", "salmon", "minnow")
//
//    ▢ val school = mutableListOf("shark", "salmon", "minnow")

//    Question 2
//    What will be the output of the following code? for (i in 3..8 step 2) print(i)
//
//    ▢ 345678
//
//    ▢ 468
//
//    ▢ 38
//
    /* 357     Respuesta  */
//
//    Question 3
//    What is the purpose of the question mark in this code? var rocks: Int? = 3
//
//    ▢ The type of the variable rocks isn't fixed.
//
//    ▢ The variable rocks can be set to null.      Respuesta
//
//    ▢ The variable rocks cannot be set to null.
//
//    ▢ The variable rocks shouldn't be initialized right away.

}

