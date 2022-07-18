package example.myapp

import kotlin.math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, open var height: Int = 40) {

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

class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int

        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}