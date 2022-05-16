fun main() {
    val number= prod(3, 9)
println(number)

    val numbernegativo=prodnegativo(-30,10)

    println(numbernegativo)

    val numbersutraicao = prodsubitraicao(0,9)
    println(numbersutraicao)

}

fun prod(valor1: Int, valor2: Int): Int {
    return valor1 * valor2
}


fun prodnegativo(x:Int, y: Int): Int {
    return x * y
}
fun prodsubitraicao(x:Int, y: Int): Int {
    return x /y
}

