package basico.aula22.controle

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var opcao: String = ""

    do{
        print("Entrou")
        println("Deseja continuar: ")
        opcao = scanner.nextLine()
    } while(opcao != "N")

}