fun main() {
    val a = 5;
    val b = 10;
    val c = 3;
    if (a>b){
        if (a>c) println("a(value = ${a}) is the largest")
        else println("c(value = ${c}) is the largest")
    }
    else if (b>c) println("b(value = ${b}) is the largest")
    else println("c(value = ${c}) is the largest")
}
