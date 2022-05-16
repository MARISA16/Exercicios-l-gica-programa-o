//1Crie funções para as 4 operações aritméticas básicas

fun main() {
    soma(7, 3)
    println(soma(7, 3))

    multiplicar(9, 12)
    println(multiplicar(9, 12))

    subtrair(70, 20)
    println(subtrair(70, 20))

    dividir(60, 20)
    println(dividir(60, 20))

}

fun soma(x: Int, y: Int): Int {
    return x + y
}

fun multiplicar(valor1: Int, valor2: Int): Int {
    return valor1 * valor2
}

fun subtrair(x1: Int, y2: Int): Int {
    return x1 - y2
}

fun dividir(valor1: Int, valor2: Int): Int {
    return valor1 / valor2
}

