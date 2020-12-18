fun absolute(number: Int): Int = if (number>=0) number else -1*number

fun main() {
    val a = -1;
    println("Absolute value of ${a} is ${absolute(a)}")
}
