fun factorial(n: Int): Int{
    if (n<=1) return 1
    else return n*factorial(n-1)
}

fun SumOfFactorials(n: Int){
	var sum = 0
    for (i in 1..n) 
    {
        print("${i}!")
        if (i<n) print("+")
        else print("=")
        sum += factorial(i)
    }
    print("${sum}")
}

fun main() {
    SumOfFactorials(4)
}
