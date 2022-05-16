//2 - Utilizando a estrutura condicional, desenvolva um algoritmo que determine se uma pessoa é maior ou menor de idade


fun main(){
    val idade= determineidade(16)
    println(idade)


}

fun  determineidade(idade:Int):Int{
    if (idade >=19){
        println("Maior de idade")

    }else{
        println("Menor de idade")
    }

return idade
}
