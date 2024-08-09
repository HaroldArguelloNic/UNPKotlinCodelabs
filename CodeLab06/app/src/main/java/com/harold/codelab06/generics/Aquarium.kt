package com.harold.codelab06.generics
/*    clase generica */
//class Aquarium<T>(val waterSupply: T)

//class Aquarium<T>: WaterSupply>(val waterSupply: T)
//fun genericsExample() {
//    val aquarium = Aquarium<TapWater>(TapWater())
//}
//  Creacion de la clase Aquarium con tipo generico seguro
class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }
    /*   Creacion de metodo generico  */
    //fun <R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}
/* función de extensión que verifique si el WaterSupply pasado es de un tipo específico */
inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T
/*  funcion de extension que verifica la coincidencia de tipos*/
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")
//fun genericsExample() {
//    val aquarium = Aquarium<TapWater>(TapWater())
//    aquarium.waterSupply.addChemicalCleaners()
//}

//fun genericsExample() {
//    val aquarium = Aquarium(TapWater())
//    aquarium.waterSupply.addChemicalCleaners()
//}
fun genericsExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    val cleaner = TapWaterCleaner()
//   aquarium.addWater(cleaner)
    isWaterClean(aquarium)
    addItemTo(aquarium)
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)
//    val aquarium3 = Aquarium(null)
//    if (aquarium3.waterSupply == null) {
//        println("waterSupply is null")
//
//    }

    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
    // llamada al metodo generico usando <> con el tipo despues del nombre de la funcion.
    println(aquarium.hasWaterSupplyOfType<TapWater>())   // true
    // llamada a la extension que verifica si waterSupply es de tipo especifico
    println(aquarium.waterSupply.isOfType<TapWater>())
    // llamada a la extension que verifica el tipo en la clase aquarium
    println(aquarium.hasWaterSupplyOfType<TapWater>())
}


fun main() {
    genericsExample()
}

//Answer these questions
//Question 1
//Which of the following is the convention for naming a generic type?
//
//▢ <Gen>
//
//▢ <Generic>
//
//▢ <T>   Respuesta
//
//▢ <X>
//
//Question 2
//A restriction on the types allowed for a generic type is called:
//
//▢ a generic restriction
//
//▢ a generic constraint     Respuesta
//
//▢ disambiguation
//
//▢ a generic type limit
//
//Question 3
//Reified means:
//
//▢ The real execution impact of an object has been calculated.
//
//▢ A restricted entry index has been set on the class.
//
//▢ The generic type parameter has been made into a real type.   Respuesta
//
//▢ A remote error indicator has been triggered.