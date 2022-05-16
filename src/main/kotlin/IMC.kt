// Utilizando funções e estrutura condicional, crie um programa que calcule o IMC de uma pessoa, imprimir o valor do IMC e sua classificação
fun main(){
    calcularIMC(64.5, 1.90)
}

fun calcularIMC(peso: Double, altura: Double) {

    val imc = peso / (altura * altura)

    println("Seu imc é: $imc")

    if (imc < 16.8) {
        println("Abaixo do peso")

    } else if (imc >= 16.8 && imc < 20.0) {
        println("Peso Normal")

    } else {
        println("Acima do peso")

    }
}

