package com.harold.codelab06.generics

/*  creamos la interface Cleaner  */
interface Cleaner<in T : WaterSupply> {
    //creamos funcion generica de la interface
    fun clean(waterSupply: T)
}

/*   creamos una clase publica WaterSupply*/
open class WaterSupply(var needsProcessing: Boolean)

/*   creamos una subclase que hereda de WaterSupply */
class TapWater : WaterSupply(true) {
    // creamos una funcion de la clase TapWater
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

/*    creamos una subclase TapWaterCleaner que hereda la interface Cleaner */
class TapWaterCleaner : Cleaner<TapWater> {
    // sobrescritura de la funcion Clean heredada de la interface
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

/*    creacion de la subclase FishStoreWater */
class FishStoreWater : WaterSupply(false)

/*    creacion de la subclase LakeWater   */
class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}


fun <T : WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

