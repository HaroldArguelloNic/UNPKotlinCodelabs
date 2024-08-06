package com.harold.codelab06



fun main() {
    /*
    Aprender sobre pares y triples
     */
    //Creamos un par conectando 2 valores con la expresion to
//    val equipment = "fish net" to "catching fish"
//    println("${equipment.first} used for ${equipment.second}")
//
    // creamos un triple con la funcion Triple
//    val numbers = Triple(6, 9, 42)
//    println(numbers.toString())
//    println(numbers.toList())

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

    val equipment = "fish net" to "catching fish"
    //asignamos los pares a los valores tool y use
    val (tool, use) = equipment
    println("$tool is used for $use")

    val numbers = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")

    /*
    Comprension de las collecciones

     */

    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    val list2 = listOf("a", "bbb", "cc")
  //  println(list2.sum())
    println(list2.sumBy { it.length })

    for (s in list2.listIterator()) {
        println("$s ")
    }

    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures.get("white spots"))

    println(cures["red sores"])

    println(cures["scale loss"])

    println(cures.getOrDefault("bloating", "sorry, I don't know"))

    println(cures.getOrElse("bloating") {"No cure for this"})

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())
}