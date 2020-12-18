fun SumOfEven(n: Int){
	var sum = 0
    for (i in 2..n step 2) 
    {
        print("${i}")
        if (i<n) print("+")
        else print("=")
        sum += i
    }
    print("${sum}")
}

fun main() {
    SumOfEven(4)
}
