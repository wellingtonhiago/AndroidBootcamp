package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    // Construtor secundário
    constructor(numberOfFish: Int) : this(){
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    val volume: Int
        get() = width * height * length / 1000

    // Iniciadores
    init {
        println("inicializando Aquarium")
    }



    fun printSize() {
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume l")
    }

}