package com.harold.codelab06

//declaracion de la funcion
//fun String.hasSpaces(): Boolean {
//    val found = this.find { it == ' ' }
//    return found != null
//}
fun String.hasSpaces() = find { it == ' ' } != null

fun main() {
    println("Does it have spaces?".hasSpaces())

//    val plant = GreenLeafyPlant(size = 10)
//    plant.print()
//    println("\n")
//    val aquariumPlant: AquariumPlant = plant
//    aquariumPlant.print()  // what will it print?

//    println(aquariumPlant.isGreen)

    fun AquariumPlant?.pull() {
        this?.apply {
            println("removing $this")
        }
    }
    val plant: AquariumPlant? = null
    plant.pull()
}
//declaracion de la clase AquariumPlant con sus propiedades
//class AquariumPlant(val color: String, private val size: Int)
//
//fun AquariumPlant.isRed() = color == "red"    // OK
// intento de acceder a la propiedad privada de la clase AquariunPlant
//fun AquariumPlant.isBig() = size > 50         // gives error


open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
//fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val AquariumPlant.isGreen: Boolean
    get() = color == "green"


//Answer these questions
//Question 1
//Which one of the following returns a copy of a list?
//
//▢ add()
//
//▢ remove()
//
//▢ reversed()             respuesta
//
//▢ contains()
//
//Question 2
//Which one of these extension functions on class AquariumPlant(val color: String, val size: Int, private val cost: Double, val leafy: Boolean) will give a compiler error?
//
//▢ fun AquariumPlant.isRed() = color == "red"
//
//▢ fun AquariumPlant.isBig() = size > 45                      respuesta
//
//▢ fun AquariumPlant.isExpensive() = cost > 10.00
//
//▢ fun AquariumPlant.isNotLeafy() = leafy == false
//
//Question 3
//Which one of the following is not a place where you can define constants with const val?
//
//▢ at the top level of a file       respuesta
//
//▢ in regular classes
//
//▢ in singleton objects
//
//▢ in companion objects