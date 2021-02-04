package basico.operadores

fun main(){
    val (v1, v2, v3, v4, v5) = listOf(2, 3, 5, 8, 10)
    val (v6, v7, v8, v9) = listOf(20, 25, 30, 50)

    println(((v1 * v4 + v6 - v1) - ((v8 - v7) + v6)))
    println((v2 * (v2 * v2 * v2) / (v9 - (v5/ v1 * v4))))
    println((((v1 * v4)/ v2) + (v2 * v4) / (v3 % v2)))




}
