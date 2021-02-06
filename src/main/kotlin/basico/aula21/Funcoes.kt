package basico.aula21

fun soma(a: Int, b: Int): Int{
    return a + b
}

fun sub(a: Int, b: Int){
    println(a-b)
}
fun main(){
    val compras = listOf("A", "B", "C")
    val comprasMutavel: MutableList<String> = mutableListOf("1", "2", "3")
    comprasMutavel.add("4")
    println(soma(1,2))
    sub(2, 1)
    println(comprasMutavel)
}