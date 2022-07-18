package example.myapp

abstract class AquariumFish{
    abstract val color: String
}

class Shark : AquariumFish(), FishAction {
    override val color: String = "gray"
    override fun eat() {
        TODO("Not yet implemented")
    }
}

class Plecostomus : AquariumFish(), FishAction {
    override val color: String = "gold"
    override fun eat() {
        TODO("Not yet implemented")
    }
}

interface FishAction {
    fun eat()
}