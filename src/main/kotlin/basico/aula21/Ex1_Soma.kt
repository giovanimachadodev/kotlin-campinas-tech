package basico.aula21

fun operacao(a: Int, b: Int){
    val resultado = ((a + b) * a) / b
    println("A soma/multiplicação e divisão é $resultado")
}

fun main(){
    operacao(4,5)
}