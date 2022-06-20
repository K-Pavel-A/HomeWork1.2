const val initialAmount = 1000
const val commission = 0.0075
var userCommission = (initialAmount * commission).toInt()
var amount = 0

fun main(){
    userCommission = if (initialAmount <= 3500) {
        3500
    } else {
        (initialAmount * commission).toInt()
    }
    amount = initialAmount - userCommission
    println("Комиссия составит: $userCommission копеек")
    println("Перевод составит: $amount копеек")
}
