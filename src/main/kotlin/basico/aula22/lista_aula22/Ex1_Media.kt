package basico.aula22.lista_aula22

import java.util.*

fun calculaMedia(n1: Double, n2: Double) : Double = (n1 + n2 )/ 2

fun verificarStatus(media: Double): String = if (media >= 6.0) "Aprovado" else "Reprovado"


fun main(){
    val scanner = Scanner(System.`in`)
    val nota1: Double
    val nota2: Double

    print("Insira a primeira nota: ")
    nota1 = scanner.nextDouble()
    print("Insira a segunda nota: ")
    nota2 = scanner.nextDouble()

    val media = calculaMedia(nota1, nota2)

    println("Média: $media | Status: ${verificarStatus(media)}")





}