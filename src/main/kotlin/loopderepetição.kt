//Utilizando o loop de repetição for, crie um programa que imprima qualquer tabuada

fun main(){
 loopRepeticao(8)

}
fun loopRepeticao(tabuada:Int){

    for (numero in 1..10) {

       val resultado=tabuada*numero

        println(tabuada.toString()+ " x "+numero.toString()+ " = "+resultado.toString())

    }
}
//tabuada "x" numero "=" resultado

