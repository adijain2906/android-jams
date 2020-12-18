fun main() {
    val check = '1';
	if (check in 'a'..'z' || check in 'A'..'Z') println("$check is an alphabet")
    else println("$check is not an alphabet")
}
