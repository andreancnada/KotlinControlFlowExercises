//Create a program that continuously retrieves a line of string — stops when input is of size 0 or null — then displays the accumulated input on a single line separated by a comma(,).

fun main() {
    val allInput = ArrayList<String>()

    while(true) {
        val input = readlnOrNull()
        if (input.isNullOrEmpty()) break
        allInput.add(input)
    }
    for (i in allInput) {
        print(i)
        if(allInput.last() != i) {
            print(",")
        }
    }
}