package braniumacademy

/**
 * @author braniumacademy
 * @website braniumacademy.net
*/

fun main() {
    var n: Int
    var k: Int
    n = getNFromKeyboard()
    k = getKFromKeyboard(n)
    var result = (n / k) * k
    println(result)
}

private fun getKFromKeyboard(n: Int): Int {
    var k: Int
    while (true) {
        println("Nhập số nguyên dương k < n: ")
        k = readLine()!!.toInt()
        if (k > 0 && k < n) {
            break
        }
    }
    return k
}

private fun getNFromKeyboard(): Int {
    var n: Int
    while (true) {
        println("Nhập vào số nguyên dương n: ")
        n = readLine()!!.toInt()
        if (n > 0) {
            break
        }
    }
    return n
}
