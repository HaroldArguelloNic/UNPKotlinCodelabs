package example.myapp

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
    var height: Int = height
    var length: Int = length

    //funcion que imprime las propiedades de la clase
    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume l")
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

    open var water: Double=0.0
        get() = volume * 0.09
}