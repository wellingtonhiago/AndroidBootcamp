package example.myapp.decor

data class Decoration(val rocks: String) {

}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("marmore")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    val decoration4 = Decoration("slate")
    println(decoration4)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration4))

}

fun main() {
    makeDecorations()
}