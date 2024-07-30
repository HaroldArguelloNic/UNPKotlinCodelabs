package example.myapp
//clase abstracta
//abstract class AquariumFish {
//    abstract val color: String
//
//}
//abstract class AquariumFish: FishAction {
//    abstract val color: String
//    override fun eat() = println("yum")
//}
//interface FishAction
interface FishAction  {
    fun eat()
}
//interface AquariumAction
interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim()  {
        println("swim")
    }
}
interface FishColor {
    val color: String
}
//singleton class
object GoldColor : FishColor {
    override val color = "gold"
}

//clase a partir de la clase abstracta AquariumFish e interface FishAction
class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}
// clase con delegacion de interface con singleton
//class Plecostomus: FishAction, FishColor by GoldColor {
//  //  override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}
//class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
//    FishColor by fishColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}
class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

// clase con delegacion de interface FishAction
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}