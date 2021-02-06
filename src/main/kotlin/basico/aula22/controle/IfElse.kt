package basico.aula22.controle

fun main(){

    val nota: Int = 8

    //modo 1
    if (nota > 6){
        println("Passou!")
    }else{
        println("Reprovou")
    }

    //modo2
    val resultado: String = if (nota > 6) "Passou!" else "Reprovou"

    if(nota in 8 .. 10){
        println("Deu certo!")
    }

    when (nota){
        10, 8 -> println("Sucesso!")
        7, 5 -> println("Sucesso!")
        else -> println("Sucesso!")
    }

    println(resultado)
}