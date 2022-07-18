package example.myapp

open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    // Iniciadores
    init {
        println("inicializando Aquarium")
    }



    fun printSize() {
        println(shape)
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume l Water: $water l (${water / volume * 100.0}% full)")
    }

}