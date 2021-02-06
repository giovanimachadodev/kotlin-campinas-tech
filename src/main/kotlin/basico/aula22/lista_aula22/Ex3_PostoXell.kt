package basico.aula22.lista_aula22

import java.util.*

fun calculaTotal(tipo: Int, litros: Double): Double {
    val valorGasolina : Double = 4.60
    val valorAlcool: Double = 3.20

    if(tipo == 1){
        if(litros <= 20){
            return litros * (valorGasolina * 0.97)
        }
        else{
            return litros * (valorGasolina * 0.95)
        }
    }else {
        if(litros <= 20){
            return litros * (valorAlcool * 0.96)
        }
        else{
            return litros * (valorGasolina * 0.94)
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    val opcao: Int
    val litros: Double
    val total: Double

    println("Insira o número de acordo com o combustível: ")
    println("1 - Gasolina")
    println("2 - Álcool")
    opcao = scanner.nextInt()
    println("Insira a quantidade de litros: ")
    litros = scanner.nextDouble()

    total = calculaTotal(opcao, litros)

    print(total)




}