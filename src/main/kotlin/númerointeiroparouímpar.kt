fun main(){
   val numero = numeroparouimpar(20)
}

fun numeroparouimpar(numero:Int):Int{

if (numero %4 == 0) {
    println("O número $numero é par")

} else {
    println("O número $numero é ímpar")

}
 return numero
}

