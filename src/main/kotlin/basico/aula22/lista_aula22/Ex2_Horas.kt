package basico.aula22.lista_aula22

import java.util.*

fun verificaHorasExtras(horas: Double) : Double = if (horas > 40) horas - 40.0 else 0.0
fun calculaSalario(horas: Double, salHora: Double, horasExtras: Double) : Double = (40.0 * salHora) + (horasExtras * (salHora * 1.5))

fun main(){
    val scanner = Scanner(System.`in`)
    val horas: Double
    val salHora: Double
    val total: Double

    print("Insira a quantidade de horas trabalhadas: ")
    horas = scanner.nextDouble()
    print("Insira o valor da hora trabalhada: ")
    salHora = scanner.nextDouble()

    val horasExtras = verificaHorasExtras(horas)

    total = calculaSalario(horas, salHora, horasExtras)

    println(total)





}