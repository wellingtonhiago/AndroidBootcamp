package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    // Construtor secundário
    constructor(numberOfFish: Int) : this(){
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
        println("Volume: ${width * length * height / 1000} l")
    }

    // Iniciadores
    init {
        println("inicializando Aquarium")
    }

    init {
        println("Volume: ${width * length * height / 1000} l")
    }


    fun printSize() {
        println("Width: $width cm Length: $length cm Height: $height cm")
    }

}