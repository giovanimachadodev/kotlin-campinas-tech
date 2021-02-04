package basico.operadores

import java.util.*

fun main(){

    val num1: Int = 1
    val num2: Int = 2

    val data1 = Date(0)
    val data2 = Date(0)

    val x: Boolean = true
    val y: Boolean = false


    println(data1 == data2)
    println(data1 === data2)
    println(num1 != num2)
    println(num1 > num2)
    println(num2 > num1)
    println(num1 >= num2)
    println(num1 <= num2)
    println(x && y)
    println(x || y)
    println(x xor y)

}