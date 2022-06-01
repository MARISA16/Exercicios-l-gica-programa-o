fun main() {


    numerosPares(10)


}




fun numerosPares(number: Int) {


    for (interacao in 1..number){

        if (interacao % 2 == 0) {
            println(interacao)
        }

    }

}
