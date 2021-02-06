package basico.aula20.lista_aula20

fun main(){
    val (a, b, c) = listOf(3, 5, 1)

    val validacao: Boolean = (a > b) && (a > c) && (b < c)

    println(validacao)


}