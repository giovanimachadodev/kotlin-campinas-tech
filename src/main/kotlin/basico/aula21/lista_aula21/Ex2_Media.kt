package basico.aula21.lista_aula21

fun calculaMedia(lista: List<Double>){
    println("A média do aluno é: ${lista.sum() / lista.count()}")
}
fun main(){
    val notas = listOf<Double>(5.0, 3.0, 5.0, 3.0)
    calculaMedia(notas)
}