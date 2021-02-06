package basico.aula21.lista_aula21

import java.util.*

fun main(){
    val listaMutavel: MutableList<Any> = mutableListOf()

    val scanner = Scanner(System.`in`)

    print("Insira a quantidade")
    val quantidade = scanner.next()
    listaMutavel.add(quantidade)

    print("Insira o nome: ")
    val nome = scanner.next()
    listaMutavel.add(nome)

    print("Insira o preço: ")
    val preco = scanner.next()
    listaMutavel.add(preco)

    listaMutavel.add(quantidade.toDouble() * preco.toDouble())

    println(listaMutavel)
}