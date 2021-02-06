package basico.aula22

import java.util.*

fun verificarHabilitado(mensagem: String?): String{
    val liberacao = mensagem ?: "Não Habilitada"
    return  "$mensagem $liberacao"
}

fun verificarIdade(idade: Int): String?{
    var mensagem: String? = if (idade >= 18) "Pode dirigir" else if (idade < 18) "Não Pode Dirigir" else null

    return mensagem
}

fun main(){
    val scanner = Scanner(System.`in`)
    val idade: Int
    val teste: String?
    print("Insira a idade: ")
    idade = scanner.nextInt()
    teste = verificarIdade(idade)
    println("${verificarHabilitado(teste)}")
}