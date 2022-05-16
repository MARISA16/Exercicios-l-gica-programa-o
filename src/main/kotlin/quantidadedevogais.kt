
//Utilizando o loop de repetição for, desenvolva um algoritmo que conte a quantidade de vogais em uma String

fun main(){
val resultadoQuantidade=quantidadeabecedario("acredite")
    println(resultadoQuantidade)
}

fun  quantidadeabecedario(parametro: String):Int{

    var contador =0
 for (letra in parametro){
   if (letra=='a'|| letra =='e' || letra=='i'||letra=='o'||letra=='u')
       contador++

    }
return contador
}
