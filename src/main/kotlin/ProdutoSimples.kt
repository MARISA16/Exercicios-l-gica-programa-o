//Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
//
//Entrada
//O arquivo de entrada contém 2 valores inteiros.
//
//Saída
//Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
//
//Exemplos de Entrada	Exemplos de Saída
//3
//9
//
//PROD = 27
//
//-30
//10
//
//PROD = -300
//
//0
//9
//
//PROD = 0

fun main() {
    val number= prod(3, 9)
println("PROD = $number")

    val numbernegativo=prodnegativo(-30,10)

    println("PROD = $numbernegativo")

    val numbersutraicao = prodsubitraicao(0,9)
    println("PROD = $numbersutraicao")

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

