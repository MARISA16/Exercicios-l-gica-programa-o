
//quartos formas de funções

fun main() {
    Double()
    imprimirMensagem("vem")

    val calculo = calcular(2,7)
    println(calculo)
    val nome =nomeCompleto()
    println(nome)
}

fun Double() {  // Não recebe parametro e não  retorna nada
   println("lá")
}
fun imprimirMensagem(mensagem:String){ // recebe parametro e não retorna nada
    println(mensagem)

}
fun calcular(numer1:Int,numero2:Int):Int{ // recebe parametro e retorno um inteiro

    return numer1 +numero2

}
fun nomeCompleto():String{ // não parametro e retorna um string
    imprimirMensagem("dormir")
    return "Marisa"
}