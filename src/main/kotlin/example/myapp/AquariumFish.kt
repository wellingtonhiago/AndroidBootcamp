package example.myapp

interface FishColor {
    val color: String
}

class Shark : FishColor, FishAction {
    override val color: String = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus : FishColor, FishAction {
    override val color: String = "gold"
    override fun eat() {
        println("eat algae")
    }
}

interface FishAction {
    fun eat()
}

