operator fun String.times(n: Int) = this.repeat(n)

fun main() {
    var n = 5
    for (i in 1..n) println("#" * i)
}
