
// Utilizando instrução condicional e operadores lógicos, crie um programa que simule um sistema de login

fun main() {
     val resultadoLogin = login("Marisa", 89512543)
    if (resultadoLogin){
        println("Acesso permitido")
    }else{
        println("Acesso negado")
    }


}

fun login(login: String, senha: Int): Boolean {


    return login == "Marisa" && senha == 89512543

}