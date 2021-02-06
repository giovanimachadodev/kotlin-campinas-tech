package basico.aula22

import java.util.*

fun verificaPositivoNegativo(a: Int) : Boolean = if (a >= 0) (true) else (false)

fun main(){
    val read = Scanner(System.`in`)

    val valor : Int?
    print("Insira um valor: ")
    valor = read.nextInt()
    println(verificaPositivoNegativo(valor))
}