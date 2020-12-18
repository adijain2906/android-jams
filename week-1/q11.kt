fun pow(n: Int, p: Int): Int{
	var number = 1
    for (i in 1..p) number *= n    
	return number
}

fun Armstrong(n: Int){
    var o = n
    var digits = 0
    while(o>0)
    {
        o/=10
        digits++
    }
    var sum = 0
    var num = 0
    o = n
    for (i in 1..digits)
    {
        num = o%10
        sum += pow(num,3)
        o/=10
    }
    if (sum==n) println("Armstrong Number")
    else println("Not an Armstrong Number")
}

fun main() {
    var n = 153
    Armstrong(n)
}
