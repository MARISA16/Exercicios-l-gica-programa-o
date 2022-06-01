//Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
//
//Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.
//
//Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
//
//Entrada
//O arquivo de entrada contém um número inteiro.
//
//Saída
//Imprima o tempo necessário seguido da mensagem "minutos".
//
//Exemplo de Entrada	Exemplo de Saída
//30
//
//60 minutos
//
//110
//
//220 minutos
//
//7
//
//14 minutos

fun main(){

    println((distancia(30)).toString()+ " minutos")
    println((distancia(110)).toString()+ " minutos")
    println((distancia(7)).toString()+ " minutos")


}
fun distancia(carrox:Int): Int {
    return carrox*2



}







//carro x= 60km/h
//carro y =90km/h
//x =
//em 1 hora e 60 minutos carro y consegue se distanciar 30quilometros do carro X
//
//60-30=30x2=60
//90-110x2 =220
//7 x 2 =14
//
//
//pronto
//carrox = 60 km/h
//carroy = 90 km/ h
//x = 10 km
//
//s=so+v.t
//sx = 10 + 60.t
//sy = 0 + 90.t
//
//encontro : sx=sy
//
//10 + 60 .t = 90 .t
//10 = 30.t
//
//t = 1/3 hora ------------------ como 1 hora = 60 minutos ( 1/3.60) = 20 minutos