//Create a program that retrieves a non-negative number then displays a formatted number 000,000,000.00. Max input number: 999 999 999.99 (added space for clarity). Invalid inputs should display invalid.

import java.text.DecimalFormat

fun main() {
    val num = readLine()?.toDoubleOrNull()
    if (num == null || num < 0)
        print("invalid")
    else {
        val formatt = DecimalFormat("#,##0.00")
        val nums = formatt.format(num)
        println(nums)
    }
}
