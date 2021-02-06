package basico.aula21.lista_aula21

fun imprimirListaReversa(lista: List<String>){
    println(lista.reversed())
}

fun main(){
    val nomes = listOf<String>("Giovani", "Priscila", "Lavínia")
    imprimirListaReversa(nomes)
}