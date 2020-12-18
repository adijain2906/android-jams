fun main() {
    val a = 56;
    var f = 1;
    if (a%5 == 0) f *= 5
    if (a%11 == 0) f *= 11
    when(f)
    {
        5 -> println("The number is divisible by 5")
        11 -> println("The number is divisible by 11")
        55 -> println("The number is divisible both by 5 and 11")
        else -> println("The number is niether divisible by 5 nor by 11")
    }
}
