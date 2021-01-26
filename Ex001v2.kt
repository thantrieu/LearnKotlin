package braniumacademy

/**
 * @author braniumacademy
 * @website braniumacademy.net
*/

fun main() {
    var n = getNFromKeyboard()
    var binaryResult = convert(n, 2)
    var hexaResult = convert(n, 16)
    println(binaryResult)
    println(hexaResult)
}

private fun convert(n: Int, base: Int): String {
    val ref: String = "0123456789ABCDEF"
    var currN = n
    var result = ""
    while (currN > 0) {
        var remainder = currN % base
        result += ref.get(remainder)
        currN /= base
    }
    return result.reversed()
}

private fun getNFromKeyboard(): Int {
    var n: Int
    while (true) {
        println("Nhập vào một số nguyên dương có 2 đến 6 chữ số: ")
        n = readLine()!!.toInt()
        if (n > 9 && n <= 999999) {
            break
        }
    }
    return n
}
