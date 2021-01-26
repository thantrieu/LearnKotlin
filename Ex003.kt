package braniumacademy

/**
 * @author braniumacademy
 * @website braniumacademy.net
*/

fun main() {
    println("Nhập vào năm cần kiểm tra: ")
    var year = readLine()!!.toInt()
    var leapYear: Boolean = isLeapYear(year)
    if (leapYear) {
        println("YES")
    } else {
        println("NO")
    }
}

fun isLeapYear(year: Int): Boolean {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true
            } else {
                return false
            }
        } else {
            return true
        }
    }
    return false
}
