package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()

    println("-------------")
    val myAquarium2 = Aquarium(height = 15)
    myAquarium2.printSize()

    println("-------------")
    val myAquarium3 = Aquarium(numberOfFish = 29)
    myAquarium3.printSize()
    myAquarium3.volume = 70
    myAquarium3.printSize()

}

fun main() {
    buildAquarium()
}