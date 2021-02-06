package basico.aula20.lista_aula20

fun main(){
    val (val1, val2, val3, val4, val5) = listOf(4, 5, 8, 30, 35)
    val expressao = (((val5/val1) * (val3 * val2)) - val4)

    println(expressao)
}