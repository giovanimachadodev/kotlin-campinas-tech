package basico.aula22

import java.util.*

fun verificaValor(valor: Int?): String{
    if(valor == null)
       return "É nulo"
    else if(valor > 10)
      return  "É maior"
    else
       return "É menor"
}

fun main(){
    val valor: Int?
    val read = Scanner(System.`in`)
   // valor = read.nextInt()
    valor = null
    println(verificaValor(valor))
}