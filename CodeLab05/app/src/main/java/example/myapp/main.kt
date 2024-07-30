package example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    //aquarium6.volume = 70
    //   println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")
    aquarium6.printSize()
    val aquarium7 = Aquarium(width = 25, height = 40, length = 25)
    aquarium7.printSize()
    //instanciacion de la subclase TowerTank
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()

}
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    buildAquarium()
    makeFish()

}

//13. Homework
//This section lists possible homework assignments for students who are working through this codelab as part of a course led by an instructor. It's up to the instructor to do the following:
//
//Assign homework if required.
//Communicate to students how to submit homework assignments.
//Grade the homework assignments.
//Instructors can use these suggestions as little or as much as they want, and should feel free to assign any other homework they feel is appropriate.
//
//If you're working through this codelab on your own, feel free to use these homework assignments to test your knowledge.
//
//Answer these questions
//Question 1
//Classes have a special method that serves as a blueprint for creating objects of that class. What is the method called?
//
//▢ A builder
//
//▢ An instantiator         //respuesta
//
//▢ A constructor
//
//▢ A blueprint
//
//Question 2
//Which of the following statements about interfaces and abstract classes is NOT correct?
//
//▢ Abstract classes can have constructors.
//
//▢ Interfaces can't have constructors.
//
//▢ Interfaces and abstract classes can be instantiated directly.                 Respuesta
//
//▢ Abstract properties must be implemented by subclasses of the abstract class.
//
//Question 3
//Which of the following is NOT a Kotlin visibility modifier for properties, methods, etc.?
//
//▢ internal
//
//▢ nosubclass                  Respuesta
//
//▢ protected
//
//▢ private
//
//Question 4
//Consider this data class: data class Fish(val name: String, val species:String, val colors:String) Which of the following is NOT valid code to create and destructure a Fish object?
//
//▢ val (name1, species1, colors1) = Fish("Pat", "Plecostomus", "gold")
//
//▢ val (name2, _, colors2) = Fish("Bitey", "shark", "gray")
//
//▢ val (name3, species3, _) = Fish("Amy", "angelfish", "blue and black stripes")
//
//▢ val (name4, species4, colors4) = Fish("Harry", "halibut")           Respuesta
//
//Question 5
//Let's say you own a zoo with lots of animals that all need to be taken care of. Which of the following would NOT be part of implementing caretaking?
//
//▢ An interface for different types of foods animals eat.
//
//▢ An abstract Caretaker class from which you can create different types of caretakers.     Respuesta
//
//▢ An interface for giving clean water to an animal.
//
//▢ A data class for an entry in a feeding schedule.