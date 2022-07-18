package example.myapp

interface FishColor {
    val color: String
}

interface FishAction {
    fun eat()
}

class Shark : FishColor, FishAction {
    override val color: String = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus : FishAction, FishColor by GoldColor {
    override fun eat() {
        println("eat algae")
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}

