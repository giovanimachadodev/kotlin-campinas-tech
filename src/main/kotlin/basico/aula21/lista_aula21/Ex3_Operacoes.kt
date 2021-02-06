package basico.aula21.lista_aula21

import java.util.*

    fun soma(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun mult(a: Int, b: Int) = a * b
    fun mod(a: Int, b: Int) = a % b

fun main(){
    val scanner = Scanner(System.`in`)
    print("Insira um número: ")
    val num1 = scanner.nextInt()
    print("Insira outro número: ")
    val num2 = scanner.nextInt()
    println("Soma = ${soma(num1, num2)}")
    println("Subtração = ${sub(num1, num2)}")
    println("Multiplicação = ${mult(num1, num2)}")
    println("Módulo = ${mod(num1, num2)}")
}