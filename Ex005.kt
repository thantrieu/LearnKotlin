package braniumacademy

/**
 * @author braniumacademy
 * @website braniumacademy.net
*/

fun main() {
    print("Nhập số nguyên dương n trong đoạn [0, 20]: ")
    val n = readLine()!!.toInt()
    if(n >= 0 && n <= 20) {
        val result = findFiboNumbers(n)
        showArrayElements(result)
    } else {
        println("Vui lòng nhập n trong đoạn từ 0 đến 20!")
    }
}

private fun showArrayElements(result: IntArray) {
    for (i in result.reversed()) {
        print("$i ")
    }
}

fun findFiboNumbers(n: Int): IntArray {
    val result = IntArray(n + 1)
    var f0 = 0
    var f1 = 1
    var fn = 0
    for (i in 0..n) {
        if(i < 2) {
            fn = i
        } else {
            fn = f0 + f1
            f0 = f1
            f1 = fn
        }
        result[i] = fn
    }
    return result
}
