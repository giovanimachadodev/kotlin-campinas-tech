package basico.aula20.operadores

fun main(){
    val (v1, v2, v3, v4) = listOf(8, 3, 2, 4)

    val soma = v1 + v2 + v3 + v4
    val sub = v1 - v2 - v3 - v4
    val mult = v1 * v2 * v3 * v4
    val div = v1 / v2
    val mod = v1 % v2


    println(soma)
    println(sub)
    println(mult)
    println(div)
    println(mod)

}