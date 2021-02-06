package basico.aula22.lista_aula22

import java.util.*

fun calculaTotal(quiloMorango: Double, quiloMaca: Double): Double {

    val totalMorango : Double = if (quiloMorango > 5.0) quiloMorango * 5.20 else quiloMorango * 5.50
    val totalMaca : Double = if (quiloMaca > 5.0) quiloMaca * 3.50 else quiloMaca * 3.80
    val totalCompra: Double = totalMorango + totalMaca
    val totalQuilos = quiloMorango + quiloMorango


    if(totalQuilos > 8.0 || totalCompra > 25.00){
        return totalCompra * 0.90
    } else {
        return totalCompra
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    val quiloMorango : Double
    val quiloMaca : Double

    print("Insira a quantidade de quilos que deseja comprar de morango: ")
    quiloMorango = scanner.nextDouble()
    print("Insira a quantidade de quilos que deseja comprar de maçã: ")
    quiloMaca = scanner.nextDouble()

    val resultado = calculaTotal(quiloMorango, quiloMaca)

    print(resultado)

}