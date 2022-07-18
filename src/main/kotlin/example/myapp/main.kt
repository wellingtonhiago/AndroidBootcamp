package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()

    println("-------------")
    val myAquarium2 = Aquarium(height = 15)
    myAquarium2.printSize()

    println("-------------")
    val myAquarium3 = Aquarium(length = 25, width = 25, height = 40)
    myAquarium3.printSize()

}

fun main() {
    buildAquarium()
}