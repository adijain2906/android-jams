//readLine() was not working

fun main() {
    val sidea = 40;
    val sideb = 30;
    val sidec = 20;
    if ((sidea + sideb) < sidec || (sidea + sidec) < sideb || (sidec + sideb) < sidea) println("Not a triangle")
    else if (sidea == sideb && sideb == sidec) println("Equilateral triangle")
    else if (sidea == sideb || sidea == sidec || sidec == sideb) println("Isoceles triangle")
    else println("Scalene triangle")
}
