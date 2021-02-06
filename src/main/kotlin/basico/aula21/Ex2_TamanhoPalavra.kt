package basico.aula21

import java.util.*

fun verificaTamanhoString(palavra: String): Int {
    return palavra.length
}

fun main(){
    println("Insira uma palavra: ")
    val scanner = Scanner(System.`in`)
    val palavra = scanner.nextLine()
    println(verificaTamanhoString(palavra))
}