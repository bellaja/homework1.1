package ru.netology
fun main() {
    println("Комиссия составляет ${calculateComission(4800)} рублей.")
}
fun calculateComission(amount: Int, commissionRate: Double = 0.0075, minCommissionRate: Int = 35): Int {
    var comission = (amount * commissionRate).toInt()
    if (comission < minCommissionRate) {
        comission = minCommissionRate
    }
    return comission
}