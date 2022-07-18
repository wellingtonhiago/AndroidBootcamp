package example.myapp

fun buildAquarium() {

    val myTower = TowerTank(height = 40, diameter = 25)
    myTower.printSize()

    println("-------------")
    val myAquarium3 = Aquarium(length = 25, width = 25, height = 40)
    myAquarium3.printSize()

}

fun makeFish() {
    val myShark = Shark()
    println(myShark.color)

    val myPlecostomus = Plecostomus()
    println(myPlecostomus.color)
}

fun main() {
    buildAquarium()
    makeFish()
}