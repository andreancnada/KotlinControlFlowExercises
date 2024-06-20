//Create a program that continuously retrieves a line of string and displays a tilde(~) and the inputted line of string beside it. It should terminate when the input is of size 0 or null.

fun main() {
    while(true) {
        val input = readLine()
        if (input.isNullOrEmpty()) break
        println("~$input")
    }
    //another way
    /*var inputArr = ArrayList<String> ()
    while(true) {
        val inputs = readlnOrNull()
        if (inputs.isNullOrEmpty()) break
        inputArr.add(inputs)
    }
    for(i in inputArr) {
        println("~$i")
    }
    */
}