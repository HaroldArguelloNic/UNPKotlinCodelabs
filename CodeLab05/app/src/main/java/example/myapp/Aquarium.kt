package example.myapp

import kotlin.math.PI

open class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    //bloque de inicializacion
    init {
        println("aquarium initializing")
    }
    //imprime el volumen en litros
//    init {
//        // 1 liter = 1000 cm^3
//        println("Volume: ${width * length * height / 1000} l")
//    }
    //inicializacion de las propiedades con los parametros por defecto
    var width: Int = width
    open var height: Int = height
    var length: Int = length

    //funcion que imprime las propiedades de la clase
    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }
    open var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 l
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open val shape = "rectangle"
// se crea la propiedad water con su get
    open var water: Double=0.0
        get() = volume * 0.9
}
//creamos la sublcase towerTank
class TowerTank (override var height: Int, var diameter: Int) : Aquarium(height= height, width = diameter, length = diameter) {
    override var volume: Int
        //Area del ellipse es igual a π * R^2

        get() = (width/2 * length/2 * height/1000 * PI).toInt()
        set(value) {
            height= ((value*1000/PI)/(width/2 * length/2)).toInt()
        }
    override var water = volume * 0.8
    override val shape = "cylinder"
 }