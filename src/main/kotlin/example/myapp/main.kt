package example.myapp

fun buildAquarium() {

    val myTower = TowerTank(height = 40, diameter = 25)
    myTower.printSize()

    println("-------------")
    val myAquarium3 = Aquarium(length = 25, width = 25, height = 40)
    myAquarium3.printSize()

}

fun main() {
    buildAquarium()
}