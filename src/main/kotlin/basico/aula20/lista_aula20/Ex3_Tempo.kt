package basico.aula20.lista_aula20

fun main(){
    val chuva: Boolean = true
    val molha: Boolean = true
    val venta: Boolean = true

    var tempestade: Boolean
    tempestade = chuva xor molha xor venta
    println(tempestade)

    tempestade = chuva && molha && !venta
    println(tempestade)

    tempestade = chuva || molha || venta
    println(tempestade)
}