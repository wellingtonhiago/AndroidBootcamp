package example.myapp.decor

data class Decoration(val rocks: String) {

}

// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}


fun makeDecorations() {

    val decoration3 = Decoration("slate")
    println(decoration3)

    val decoration4 = Decoration("slate")
    println(decoration4)

    println(decoration3.equals(decoration4))

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val (exemplo, wood, diver) = d5

    println(exemplo)
    println(wood)
    println(diver)

}

fun main() {
    makeDecorations()
}