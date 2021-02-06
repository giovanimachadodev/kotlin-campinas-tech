package basico.aula21

fun main(){
    val nome: String = "Giovani"
    println("Olá $nome")

    val lista = listOf("Giovani", "Priscila")
    var a: Int = 365.dec()
    println(a)
    println("O último caracter da String é ${nome.last()}")
    println("O primeiro caracter da String é ${nome.first()}")
    println("O primeiro colocado foi: ${lista[0]}")
}