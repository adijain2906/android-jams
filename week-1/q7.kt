fun factorial(n: Int): Int{
    if (n<=1) return 1
    else return n*factorial(n-1)
}

fun main() {
    val n = 6
    println("${n}! = ${factorial(n)}")
}
