package braniumacademy

/**
 * @author braniumacademy
 * @website braniumacademy.net
*/

fun main() {
    println("Nhập số nguyên dương 0-90: ")
    var n: Int = readLine()!!.toInt()
    if (n >= 0 && n <= 90) {
        var fn = fibonacci(n)
        println(fn)
    } else {
        println("Vui lòng nhập n trong đoạn từ 0 đến 90!")
    }
}

fun fibonacci(n: Int): Long {
    if (n < 2) {
        return n.toLong()
    }
    var f0: Long = 0
    var f1: Long = 1
    var fn: Long = 0
    for (i in 2..n) {
        fn = f0 + f1
        f0 = f1
        f1 = fn
    }
    return fn
}
